package exam07;

import java.util.Scanner;

public class CaseTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ŀ�Ǹ� �ֹ����ּ���:");
		
		String cof = scan.next();
		int num = scan.nextInt();
		
		switch(cof)
		{
		case "����������":
			System.out.printf("total = %d", 2000*num);
			break;
		case "�Ƹ޸�ī��":
			System.out.printf("total = %d", 2500*num);
			break;
		case "ŰǪġ��":
			System.out.printf("total = %d", 3000*num);
			break;
		case "ī���":
			System.out.printf("total = %d", 3500*num);
			break;
			
			
		}
	}

}
