package test06;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		
		int h = scan.nextInt();
		
		for (int i = 1; i <= h; i++) //���� ��ŭ �� ��ɾ� ����
		{									
			for (int j = 1; j <= h - i + 1; j++) 	//�� ����(�� �� ����) ���̼��� 1�� �߰��Ѱ� 1�� ����(�� ó�� �κ� ����)
				System.out.print("*");					
			System.out.print("\n");	//������ ���� ������ �� �ٲ�					
		}
	}

}
