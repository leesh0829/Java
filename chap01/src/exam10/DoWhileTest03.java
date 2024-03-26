package exam10;

import java.util.Random;

public class DoWhileTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		int num1 = 1+ran.nextInt(6);
		int num2 = 1+ran.nextInt(6);
		int result = num1 + num2;
		do {
			num1 = 1+ran.nextInt(6);
			num2 = 1+ran.nextInt(6);
			result = num1 + num2;
			System.out.printf("1:%d\n", num1);
			System.out.printf("2:%d\n", num2);
			System.out.printf("°á°ú:%d\n", result);
		}while(result < 5);
	}

}
