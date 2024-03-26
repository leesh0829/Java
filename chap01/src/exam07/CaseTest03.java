package exam07;

import java.util.Scanner;

public class CaseTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("커피를 주문해주세요:");
		
		String cof = scan.next();
		int num = scan.nextInt();
		
		switch(cof)
		{
		case "에스프레소":
			System.out.printf("total = %d", 2000*num);
			break;
		case "아메리카노":
			System.out.printf("total = %d", 2500*num);
			break;
		case "키푸치노":
			System.out.printf("total = %d", 3000*num);
			break;
		case "카페라때":
			System.out.printf("total = %d", 3500*num);
			break;
			
			
		}
	}

}
