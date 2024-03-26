//정수 -10 ~ 10사이의 난수를 발생시켜 음수, 양수, 0인지를 판별하는 프로그램 작성 단, do-while문 조건문 사용해 출력
package test0517;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int b;
		
		do {
			int a = -10+rand.nextInt(11);
			System.out.printf("발생한 난수: %d		", a);
			if(a > 0)	System.out.println("양수입니다");
			else if(a < 0) System.out.println("음수입니다");
			else System.out.println("0입니다");
			System.out.print("다시 한번? yes:1 no:0");
			b = scan.nextInt();
		}while(b == 1);
		
		System.out.print("프로그램 종료");
	}

}
