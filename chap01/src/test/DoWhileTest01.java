package test;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTest01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num = 1+ran.nextInt(9999);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 맞추기 업다운 게임!!");
		System.out.print("숫자 입력: ");
		
		int num2 = scan.nextInt();
		int cnt = 1;
		do {
			if(num<num2)
				System.out.println("더 작은 수를 입력하세요.");
			else if(num>num2)
				System.out.println("더 큰 수를 입력하세요.");
			
			System.out.println("숫자 입력: ");
			num2 = scan.nextInt();
			cnt++;
		}while(num != num2);
		
		System.out.printf("정답:%d, %d회 만에 정답 맞춤.",num, cnt);
	}

}
