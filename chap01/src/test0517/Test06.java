//정수 -10~10 난수 2개를 입력받아 대소를 비교하는 프로그램 작성
package test0517;

import java.util.Random;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int retry = 1;
		
		while(retry == 1)
		{
			int a = -10+rand.nextInt(11);
			int b = -10+rand.nextInt(11);
			
			if(a > b)
				System.out.printf("%d가 %d보다 큽니다. (%d > %d) \n", a, b, a, b);
			else if(a < b)
				System.out.printf("%d가 %d보다 작습니다. (%d < %d) \n", a, b, a, b);
			else
				System.out.printf("%d와 %d가 같습니다. (%d = %d) \n", a, b, a, b);
			
			System.out.printf("다시 할거면 1, 안할거면 0");
			
			retry = scan.nextInt();
		}
	}

}
