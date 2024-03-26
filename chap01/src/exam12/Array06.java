package exam12;

import java.util.Random;
import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열의 길이(n)는? "); //12
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = 1+rand.nextInt(10); //1~10
			System.out.printf("a[%d] = %d\t", i, a[i]);
			if((i+1) % 3 == 0) System.out.println();
		}
		
		System.out.println("\n 막대그래프");
		
		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < n; j++) {
				if (a[j] >= i)
					System.out.print("*\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
		
		for(int i = 0; i < a.length-1; i++)
			System.out.print("---------");
		
		System.out.println();
		
		for(int i = 0; i <= a.length-1; i++)
			System.out.printf("%d \t", i%10);
	}

}
