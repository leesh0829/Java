package test;
//Scanner�� ���� �Է� �ް� �Է¹��� ������ ���� 25�� 25�� +-5�� ���� ���ϱ�
import java.util.Scanner;
import java.util.Random;
public class ScannerTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("�Է�");
		
		int num = scan.nextInt();
		int num2 = -5+num+ran.nextInt(11+num);
		
		System.out.printf("%d", num2);
	}

}
