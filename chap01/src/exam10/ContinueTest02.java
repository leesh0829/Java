package exam10;

import java.util.Scanner;

public class ContinueTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫 값 입력: ");
		
		int sum = 0;
		
		for(int i = 0; i <= 5; i++)
		{
			i = scan.nextInt();
			if(i < 0) continue; 
			sum= sum + i;
		}
		System.out.println(sum);
	}

}
