package test;

import java.util.Scanner;

//*�̿��� ���� �Ʒ�����, ���� h�� �����ﰢ�� ǥ�� ���α׷� for��
public class ContinueTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �� �Է�: ");
		
		int h = scan.nextInt();
		for(int i=1; i<=h+1; i++) {
			for(int j=h+1; j>i; j--)
				System.out.print(" ");
			for(int k=1; k<=i; k++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
