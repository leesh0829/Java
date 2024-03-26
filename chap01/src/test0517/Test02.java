//정수 3개 이력 후 최댓값과 최소값을 찾으시오
package test0517;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = a;
		int min = a;
		
		if(max < b)	max = b;
		if(min > c)	min = c;
		
		if(min > b) min = b;
		if(max < c) max = c;
		
		System.out.printf("최대 값 = %d \n", max);
		System.out.printf("최솟값 = %d", min);
		
		
	}

}
