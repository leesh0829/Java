package test;

import java.util.Scanner;

//*�̿��� ���� �Ʒ�����, ���� h�� �����ﰢ�� ǥ�� ���α׷� for��
public class ContinueTest04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �� �Է�: ");
		
		int h = scan.nextInt();
		for(int i=1; i<=h; i++) {
			for(int j=i; j<=i-1; j++)
				System.out.print(" ");
			for(int k=i; k<h; k++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
