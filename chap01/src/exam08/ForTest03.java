package exam08;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܼ� �Է�=");
		
		int a = scan.nextInt();
		
		for(int i=a; i<10; i++)
		{
			System.out.printf("*****%d��****** \n",i);
			for(int j=1; j<=9; j++)
				System.out.printf("%d * %d = %d\n", i, j, i*j);
		}		
	}

}
