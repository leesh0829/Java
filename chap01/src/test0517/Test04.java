//키보드를 통해 별의 총 개수, 한행에 출력할 별의 개수, 줄 바꿈이 행의 수를 입력받아 출력되고록 for문과 조건문을 사용하여 프로그앰을 작성하시오
package test0517;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("별 개수, 한행 별 개수,줄바꿈을 할 행의 수");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= a; i++)
		{
			System.out.print("*");
			if(i%b == 0)
			{
				System.out.println();
				cnt++;
				if(cnt%c == 0)
					System.out.println();
			}
		}
	}

}
