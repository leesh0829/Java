package exam06;
//Scanner�� ���� �Է¹ް� if-else�̿��� 60���̻�� �հ� 60�� �̸��� ���հ�
import java.util.Scanner;
public class IfElseTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է�>>");
		
		int score = scan.nextInt();
		
		if(score <= 60)
		{
			System.out.printf("����� ������ %d�Դϴ�. \"�հ�\"�� �����մϴ�.\n", score);
		}
		else
		{
			System.out.printf("����� ������ %d�Դϴ�. \"���հ�\"�� �����մϴ�.\n", score);
			System.out.println("�絵���ϼ���.");
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}

}
