//���� -10 ~ 10������ ������ �߻����� ����, ���, 0������ �Ǻ��ϴ� ���α׷� �ۼ� ��, do-while�� ���ǹ� ����� ���
package test0517;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int b;
		
		do {
			int a = -10+rand.nextInt(11);
			System.out.printf("�߻��� ����: %d		", a);
			if(a > 0)	System.out.println("����Դϴ�");
			else if(a < 0) System.out.println("�����Դϴ�");
			else System.out.println("0�Դϴ�");
			System.out.print("�ٽ� �ѹ�? yes:1 no:0");
			b = scan.nextInt();
		}while(b == 1);
		
		System.out.print("���α׷� ����");
	}

}
