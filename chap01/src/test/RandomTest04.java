package test;

import java.util.Random;

//Random ���� �ΰ� �Է� ���� 10 �̻� �� �� ���� ��
public class RandomTest04 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = -20+ran.nextInt(40);
		int b = -20+ran.nextInt(40);
		int result = (a>b) ? a-b : b-a; //0
		
		System.out.printf("%d�� %d��", a, b);
		
		/*if(a<b)
			result = b-a;
		else 
			result = a-b; */
		
		System.out.printf("���� \"%d\"�̰�, ", result);
		
		if(result > 10)
			System.out.printf("�� ���� \"10\"�̻� ���̰� ����.");
		else
			System.out.printf("�� ���� \"10\"�̸� ���̰� ����.");
	}

}
