package test;

import java.util.Random;

//Random로 -5~5주어서 둘중 큰 값 차즌 프로그램
public class RandomTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = -5+ran.nextInt(11);
		int b = -5+ran.nextInt(11);
		
		int result = (a>=b) ? a : b;
		
		System.out.printf("%d와 %d 중에 max값은 %d이다.", a, b, result);
	}

}
