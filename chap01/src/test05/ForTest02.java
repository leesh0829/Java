package test05;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력=");
		
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++)
			System.out.print("*");
	}

}
