package test;
//Scanner�� �� ���� �Ǽ��� �Է¹޾� �հ� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է�");
		
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		
		double sum = d1 + d2;
		double ave = (d1 + d2) / 2;
		
		System.out.printf("�Ǽ� d1 :%.1f\n", d1);
		System.out.printf("�Ǽ� d2: %.1f\n", d2);
		System.out.printf("�հ�: %.1f\n", sum);
		System.out.printf("���: %.1f\n", ave);
		
	}

}
