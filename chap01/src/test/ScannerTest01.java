package test;
//Scanner�� 3�ڸ��� ������ �Է� �޾� ������ �ڸ����� ������ ���� ������ �ڸ����� �������� ���� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �� �Է�: ");
		
		int num1 = scan.nextInt();
		
		int h = num1 / 10;
		int m = num1 % 10;
		
		System.out.printf("������ �ڸ��� ������ ����: %d\n", h);
		System.out.printf("������ �ڸ� ����: %d", m);
		
	}

}
