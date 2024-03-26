package test05;

import java.util.Scanner;

public class DoWhileTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a;
		
		do
		{
			System.out.print("정수 입력=");
			
			a = scan.nextInt();
		}while(a/100 < 1 || a/1000 >= 1);
	}

}
