package test06;

import java.util.Scanner;

public class Star04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		
		int h = scan.nextInt();
		for (int i = 1; i <= h; i++) {				//���ٸ��� �� ��ɾ� ����
			for (int j = 1; j <= i - 1; j++)		//1���� �ߴ� ��Ŀ��� �� ó�� �� ������ ���� ���¿��� �������� ä���
				System.out.print(" ");				
			for (int j = 1; j <= h - i + 1; j++)	//�� �ٸ��� ���̼��� 1�� �߰��Ѱ� 1�� ����(�� ó�� �κ� ����)
				System.out.print("*"); 				
			System.out.print("\n");	
		}
	}

}
