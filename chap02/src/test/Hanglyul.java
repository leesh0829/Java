package test;

import java.util.Scanner;

public class Hanglyul {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] a = new int[4][3];
		System.out.println("4x3행렬 요소 입력");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.printf("a[%d][%d] =", i, j);
				a[i][j] = scan.nextInt();
			}
		}
		
		
		int[][] b = new int[3][4];
		System.out.println("3x4행렬 요소 입력");
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[i].length; j++)
			{
				System.out.printf("b[%d][%d] =", i, j);
				b[i][j] = scan.nextInt();
			}
		}
		
		
		
		int row = a.length;
		int a1 = a[0].length;
		int b1 = b[0].length;
		
		int[][] result = new int[row][b1];
		
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < b1; j++)
			{
				for(int k = 0; k < a1; k++)
				{
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		
		System.out.println("행렬 곱셈 결과");
		
		for(int i = 0; i < result.length; i++)
		{
			for(int j = 0; j < result[i].length; j++)
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}