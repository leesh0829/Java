package test06;

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("높이 입력: ");
		
		int h = scan.nextInt();
		
		for (int i = 1; i <= h; i++) //높이 만큼 안에 있는 명령어 실행 
		{									
			for (int j = 1; j <= h - i; j++)		//2번에 했던 그 방식에서 한 줄씩 빼서 공백 채우기
				System.out.print(" ");
			for (int j = 1; j <= i ; j++)			//나머지 부분을 줄 수만큼 채우기
				System.out.print("*"); 				
			System.out.print("\n");						//한 줄마다 줄 바꾸기
		}
	}

}
