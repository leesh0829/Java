package test06;

import java.util.Scanner;

public class Staar01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		
		int h = scan.nextInt();
		
		for(int i = 1; i<=h; i++) //���� �� ��ŭ ����
		{
			for(int j = 1; j<=i; j++) //�� ����(���� �� ����)�� �ٸ��� i(1�� �þ�� ��ŭ)�� ����
				System.out.print("*");
			System.out.print("\n"); //������ ���� ������ �� �ٲ�
		}
	}

}
