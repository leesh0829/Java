//���� -10~10 ���� 2���� �Է¹޾� ��Ҹ� ���ϴ� ���α׷� �ۼ�
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
				System.out.printf("%d�� %d���� Ů�ϴ�. (%d > %d) \n", a, b, a, b);
			else if(a < b)
				System.out.printf("%d�� %d���� �۽��ϴ�. (%d < %d) \n", a, b, a, b);
			else
				System.out.printf("%d�� %d�� �����ϴ�. (%d = %d) \n", a, b, a, b);
			
			System.out.printf("�ٽ� �ҰŸ� 1, ���ҰŸ� 0");
			
			retry = scan.nextInt();
		}
	}

}
