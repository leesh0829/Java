//���� -20 ~ 20 ������ ������ �߻����� ������ ���ϴ� ���α׷��� �ۼ�, do while���� ���ǹ� ���
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
				System.out.printf("%d�� ������ %d�Դϴ� \n", a, result);
			}
			else if(a < 0) {
				result = -a;
				System.out.printf("%d�� ������ %d�Դϴ� \n", a, result);
			}
			else 
				System.out.printf("%d�� 0�̶� ������ �����ϴ�. \n", a);
			
			System.out.printf("�ٽ� �ҰŸ� 1, ���ҰŸ� 0");
			
			retry = scan.nextInt();
			
		}while(retry == 1);
		
		System.out.println("\n����");
	}

}
