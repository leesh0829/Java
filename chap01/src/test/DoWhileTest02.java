package test;
//�Է¹��� ���� ���� �ڸ��� ���ϴ� ���α׷� do while ��
import java.util.Scanner;

public class DoWhileTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է�");
		
		int a = scan.nextInt();
		int b = 1;
		int c = 0;
		int d;
		
		System.out.printf("�Է� ����: %d", a);
		
		do {
			d = a/b;
			c++;
			b *= 10;
		}while(a != 0);
		System.out.printf("%d�� %d�ڸ� ����", c-1);
	}

}
