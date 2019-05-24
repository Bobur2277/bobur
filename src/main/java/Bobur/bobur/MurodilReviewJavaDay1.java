package Bobur.bobur;

import java.util.Scanner;

public class MurodilReviewJavaDay1 {
	public static void main(String[] args) {
//
//		int i=10;//explicit casting(upcasting)
//		double d=i;
//		System.out.println(d);
//		
//		int n=7;//implicit casting(downcasting)
//		byte b=(byte)n;
//		System.out.println(b);
//		
//		Integer num=n;//autoboxing
//		int j=num;//unboxing
		Scanner scanner=new Scanner(System.in);
		System.out.println("pls enter smthg: ");
		String smthg =scanner.nextLine();
		
		
		//String word="Bobur";
		String rev="";
		for (int k = smthg.length()-1; k >= 0; k--) {
			rev=rev+smthg.charAt(k);
		}
		System.out.println("ur smthg reversed: "+rev);
//		String reverse=new StringBuilder(smthg).reverse().toString();
//		System.out.println(reverse);
		
		for (int i = 20; i > 0; i--) {
			System.out.print(i);
		}
		
		}
	
	
	}

