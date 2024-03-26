package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삼각형의 높이(h) : ");
		
		int h = scan.nextInt();
		
		for(int i =1; i<=h; i++)
		{
			for(int j = 1; j<=h-i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
