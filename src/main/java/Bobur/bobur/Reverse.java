package Bobur.bobur;

public class Reverse {
	public static void main(String[] args) {

		String aa = "123456";

		String rev = "";

		String ss = new StringBuilder(aa).reverse().toString();

		for (int i = aa.length() - 1; i >= 0; i--) {
			rev = rev + aa.charAt(i);
		}
		System.out.println(rev);

		System.out.println(ss);

		int num = 12345;
		int reverse = 0;

		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);

		int num1 = 123456789;
		System.out.println(new StringBuilder(String.valueOf(num1)).reverse());

		// reverse string using StringBuilder
		int name = 1234;
		String name1 = "" + name;
		String temp = new StringBuilder("" + name).reverse().toString();
		System.out.println(temp);

		// how to reverse using for loop traditional way

		String reverse1 = "";
		for (int i = name1.length() - 1; i >= 0; i--) {
			reverse1 += name1.charAt(i);
		}
		System.out.println(reverse1);

		String word = "This chapter is very much related and dependent to sharing Test Context between the Cucumber";

		//String reverse2 = "";

		StringBuilder stringBuilder = new StringBuilder();
		String[] words = word.split(" ");
		
		for (int j = words.length - 1; j >= 0; j--) {
			stringBuilder.append(words[j]).append(" ");

		}
		System.out.println("Reverse words: " + stringBuilder.toString().trim());
		
		
		
	}

}
