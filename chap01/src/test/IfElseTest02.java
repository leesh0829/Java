package test;
//Random Ŭ���� -10 ~10 ���� �ΰ��޾� ū�� ������ ������ ��
import java.util.Random;
public class IfElseTest02 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num1 = -10+ran.nextInt(20);
		int num2 = -10+ran.nextInt(20);
		
		if(num1 > num2)
		{
			System.out.printf("�߻��� ������ %d�� %d�̴�.\n", num1, num2);
			System.out.printf("%d�� %d���� ũ��", num1, num2);
		}
		else if(num1 < num2)
		{
			System.out.printf("�߻��� ������ %d�� %d�̴�.\n", num1, num2);
			System.out.printf("%d�� %d���� ũ��", num2, num1);
		}
		else
		{
			System.out.printf("�߻��� ������ %d�� %d�̴�.\n", num1, num2);
			System.out.printf("%d�� %d�� ����", num1, num2);
		}
	}

}
