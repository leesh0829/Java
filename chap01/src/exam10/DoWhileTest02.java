package exam10;

import java.util.Random;

public class DoWhileTest02 {

	public static void main(String[] args) {
		Random ran = new Random(); //���� ��ü ����
		int num1 = 1+ran.nextInt(6);
		System.out.printf("�ֻ��� ��ȣ:%d\n",num1);
		do {
			num1 = 1+ran.nextInt(6);
			System.out.printf("�ֻ��� ��ȣ:%d\n",num1);
		}while(num1 != 6);
		
	}

}
