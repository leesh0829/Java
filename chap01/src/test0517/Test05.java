//정수 -20 ~ 20 사이의 난수를 발생시켜 절댓값을 구하는 프로그램을 작성, do while문과 조건문 사용
package test0517;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		int retry;
		
		do
		{
			int a = -20+rand.nextInt(41);
			
			if(a > 0) {
				result = a;
				System.out.printf("%d의 절댓값은 %d입니다 \n", a, result);
			}
			else if(a < 0) {
				result = -a;
				System.out.printf("%d의 절댓값은 %d입니다 \n", a, result);
			}
			else 
				System.out.printf("%d는 0이라서 절댓값이 없습니다. \n", a);
			
			System.out.printf("다시 할거면 1, 안할거면 0");
			
			retry = scan.nextInt();
			
		}while(retry == 1);
		
		System.out.println("\n종료");
	}

}
