package test;

import java.util.Scanner;

//*�̿��� ���� �Ʒ�����, ���� h�� �����ﰢ�� ǥ�� ���α׷� for��
public class ContinueTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �� �Է�: ");
		
		int h = scan.nextInt();
		for(int i=1; i<=h; i++) {
			for(int j=i; j<h; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
