package test;

import java.util.Scanner;

//*이용해 왼쪽 아래시작, 높이 h인 직각삼각형 표시 프로그램 for문
public class ContinueTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫 값 입력: ");
		
		int h = scan.nextInt();
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
