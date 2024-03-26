//정수 -20 ~ 20 사이에 난수 3개를 발생시켜 최댓값과 최솟값을 찾으시오(조건문 사용)
package test0517;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int a = -20+rand.nextInt(41);
		int b = -20+rand.nextInt(41);
		int c = -20+rand.nextInt(41);
		
		int max = a;
		int min = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		if(max < b)	max = b;
		if(min > c)	min = c;
		
		if(min > b) min = b;
		if(max < c) max = c;
		
		System.out.printf("최대 값 = %d \n", max);
		System.out.printf("최솟값 = %d", min);
		
	}

}
