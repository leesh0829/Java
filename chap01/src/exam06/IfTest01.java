package exam06;
//Scanner�� ���� �Է¹ް� if�̿��� 60���̻�� �հ� 60�� �̸��� ���հ�
import java.util.Scanner;
public class IfTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		
		int num = scan.nextInt();
		
		if(num <= 60)
		{
			System.out.printf("����� ������ %d�Դϴ�. \"�հ�\"�� �����մϴ�.\n", num);
		}
		if(num > 60)
		{
			System.out.printf("����� ������ %d�Դϴ�. \"���հ�\"�� �����մϴ�.\n", num);
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}

}
