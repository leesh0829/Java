package test;

import java.util.Random;

//Random�� -5~5�־ ���� ū �� ���� ���α׷�
public class RandomTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = -5+ran.nextInt(11);
		int b = -5+ran.nextInt(11);
		
		int result = (a>=b) ? a : b;
		
		System.out.printf("%d�� %d �߿� max���� %d�̴�.", a, b, result);
	}

}
