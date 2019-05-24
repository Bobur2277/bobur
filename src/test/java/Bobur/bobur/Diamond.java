package Bobur.bobur;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		//			  *				
		//			 ***			
		//			*****	
		//		   *******
		//		  *********
		//		   *******
		//			*****
		//   		 ***
		//			  *
		
		//Print upper triangle
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of star rows");
		int number = input.nextInt();//add varibles dinamic i did only if number is even
		
		for (int i = 1; i <= number/2-1; i++) {
			for (int k = 1; k <= number - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = i-1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Print lower triangle
		for (int i = number/2+1; i >=1; i--) {
			
			for (int k = 1; k <= number - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int j = i-1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		input.close();
	}

}
