package test;
//Scanner�� ������ �Է¹޾� ���� ������ ������������ 0���� �����ϴ� ���α׷��� if������ �ۼ�
import java.util.Scanner;
public class IfTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("num = ");
		
		int num = scan.nextInt();
		
		if(num > 0)
			System.out.printf("�Էµ� ���� %d�� ����Դϴ�.", num);
		if(num < 0)
			System.out.printf("�Էµ� ���� %d�� �����Դϴ�.", num);
		if(num == 0)
			System.out.printf("�Էµ� ���� %d�� 0�Դϴ�.", num);
	}

}
