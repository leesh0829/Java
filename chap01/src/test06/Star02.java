package test06;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("높이 입력: ");
		
		int h = scan.nextInt();
		
		for (int i = 1; i <= h; i++) //높이 만큼 안 명령어 실행
		{									
			for (int j = 1; j <= h - i + 1; j++) 	//위 포문(한 줄 마다) 높이수의 1씩 추가한걸 1씩 증가(맨 처음 부분 때문)
				System.out.print("*");					
			System.out.print("\n");	//한줄이 끝날 때마다 줄 바꿈					
		}
	}

}
