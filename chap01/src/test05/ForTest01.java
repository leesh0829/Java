package test05;
//���� �Է� ���� ��� ǥ�� ��� ���� ���ϱ� For

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�=");
		
		int a = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=a; i++) {
			if(a%i == 0) {
				System.out.printf("%d \n", i);
				count++;
			}
		}
		System.out.printf("%d�� ����� %d�� �Դϴ�.", a, count);
	}

}
