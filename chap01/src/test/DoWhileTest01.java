package test;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTest01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num = 1+ran.nextInt(9999);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ���߱� ���ٿ� ����!!");
		System.out.print("���� �Է�: ");
		
		int num2 = scan.nextInt();
		int cnt = 1;
		do {
			if(num<num2)
				System.out.println("�� ���� ���� �Է��ϼ���.");
			else if(num>num2)
				System.out.println("�� ū ���� �Է��ϼ���.");
			
			System.out.println("���� �Է�: ");
			num2 = scan.nextInt();
			cnt++;
		}while(num != num2);
		
		System.out.printf("����:%d, %dȸ ���� ���� ����.",num, cnt);
	}

}
