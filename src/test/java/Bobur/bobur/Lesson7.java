package Bobur.bobur;

public class Lesson7 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i += 2) {
		      for (int j = 0; j < 5 - i / 2; j++)
		        System.out.print(" ");

		      for (int j = 0; j < i; j++)
		        System.out.print("*");

		      System.out.print("\n");
		    }

		    for (int i = 5; i > 0; i -= 2) {
		      for (int j = 0; j < 7 - i / 2; j++)
		        System.out.print(" ");

		      for (int j = 0; j < i; j++)
		        System.out.print("*");

		      System.out.print("\n");
		    }
	}
}
