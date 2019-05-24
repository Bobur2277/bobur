package Bobur.bobur;

public class lesson2 {

	public static void main(String[] args) {
// 1!+2!+3!+4!+5!
		int number = 5, result = 1, sum = 0;
		
		for (int i = 1; i <= number; i++) {
			
			result=1;
			for (int j = 1; j <= i; j++) {
				
				result = result * j;
			}

			sum = sum + result;
			
		}
		System.out.println(sum);
	}

}
