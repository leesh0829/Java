package test06;

import java.util.Scanner;

public class Staar01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("높이 입력: ");
		
		int h = scan.nextInt();
		
		for(int i = 1; i<=h; i++) //높이 수 만큼 실행
		{
			for(int j = 1; j<=i; j++) //위 포문(높이 수 마다)한 줄마다 i(1씩 늘어나는 만큼)별 짓기
				System.out.print("*");
			System.out.print("\n"); //한줄이 끝날 때마다 줄 바꿈
		}
	}

}
