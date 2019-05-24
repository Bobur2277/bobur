package Bobur.bobur;

public class Bobur2277 {
 public static void main(String[] args) {
	//1st verison
	 String name = "BoburSalimSayidSamir";
	 String reverse = new StringBuilder(name).reverse().toString();
	 System.out.println("1st version: "+reverse);
	 
	 //2nd version
	 String aa="Hello world";
	 String rev="";
	 for (int i = aa.length()-1; i >= 0; i--) {
		rev=rev+aa.charAt(i);
		
	}
	 System.out.println("2nd version: "+rev);
}
}
