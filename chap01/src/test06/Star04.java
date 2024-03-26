package test06;

import java.util.Scanner;

public class Star04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("높이 입력: ");
		
		int h = scan.nextInt();
		for (int i = 1; i <= h; i++) {				//한줄마다 안 명령어 실행
			for (int j = 1; j <= i - 1; j++)		//1번에 했던 방식에서 맨 처음 줄 공백을 없엔 상태에서 공백으로 채우기
				System.out.print(" ");				
			for (int j = 1; j <= h - i + 1; j++)	//한 줄마다 높이수의 1씩 추가한걸 1씩 증가(맨 처음 부분 때문)
				System.out.print("*"); 				
			System.out.print("\n");	
		}
	}

}
