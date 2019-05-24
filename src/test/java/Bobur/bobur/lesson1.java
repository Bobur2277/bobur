package Bobur.bobur;

public class lesson1 {

	public static void main(String[] args) {
		// 1+10+2+9+3+8+4+7+5+6
		int result = 0;
		for (int i = 1, j = 10; i <= 5 && j >= 6; i++, j--) {
			result = result + i + j;
		}
		System.out.println(result);
	}

}
