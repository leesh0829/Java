package exam05;
//Scanner Ŭ������ �̿��ؼ� Ű����� ������ �Է¹ޱ�
import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ΰ��� ���� �Է� �� ��");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		int min = num1 - num2;
		int time = num1  * num2;
		double vidi = num1 / (float)num2; //int���� �����ϸ� int���� �����Ƿ� �ϳ� �̻��� ū �Ǽ� ���·� ��������
		
		System.out.printf("result = %d\n", sum);
		System.out.printf("result = %d\n", min);
		System.out.printf("result = %d\n", time);
		System.out.printf("result = %.3f\n", vidi); //�����ڸ� ���� ���� �ƴϴϱ� �Ҽ��� ���ڸ� ����
		
		
	}

}
