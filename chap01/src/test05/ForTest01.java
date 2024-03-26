package test05;
//정수 입력 정수 약수 표시 약수 개수 구하기 For

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력=");
		
		int a = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=a; i++) {
			if(a%i == 0) {
				System.out.printf("%d \n", i);
				count++;
			}
		}
		System.out.printf("%d의 약수는 %d개 입니다.", a, count);
	}

}
