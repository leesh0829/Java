package test;
//3�������Է� �ּڰ����ϴ� if������
import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է�>>");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int result = num1;
		
		if(num1 > num2)
			result = num2;
		if(result > num3)
			result = num3;
		
		System.out.printf("���� ���� ��: %d", result);
	}

}
