//Ű���带 ���� ���� �� ����, ���࿡ ����� ���� ����, �� �ٲ��� ���� ���� �Է¹޾� ��µǰ�� for���� ���ǹ��� ����Ͽ� ���α׾��� �ۼ��Ͻÿ�
package test0517;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ����, ���� �� ����,�ٹٲ��� �� ���� ��");
		
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
