package test06;

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		
		int h = scan.nextInt();
		
		for (int i = 1; i <= h; i++) //���� ��ŭ �ȿ� �ִ� ��ɾ� ���� 
		{									
			for (int j = 1; j <= h - i; j++)		//2���� �ߴ� �� ��Ŀ��� �� �پ� ���� ���� ä���
				System.out.print(" ");
			for (int j = 1; j <= i ; j++)			//������ �κ��� �� ����ŭ ä���
				System.out.print("*"); 				
			System.out.print("\n");						//�� �ٸ��� �� �ٲٱ�
		}
	}

}
