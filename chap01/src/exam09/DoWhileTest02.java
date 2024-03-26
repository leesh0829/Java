package exam09;

import java.util.Scanner;

public class DoWhileTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력=");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int i;
		for(i=1; i<=b; i++) {
			System.out.print("*");
			if (i % a == 0) 
				System.out.print("\n");
			if (i % (a*3) == 0) 
				System.out.print("\n");
		}
	}

}
