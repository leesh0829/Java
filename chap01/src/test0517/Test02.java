//���� 3�� �̷� �� �ִ񰪰� �ּҰ��� ã���ÿ�
package test0517;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = a;
		int min = a;
		
		if(max < b)	max = b;
		if(min > c)	min = c;
		
		if(min > b) min = b;
		if(max < c) max = c;
		
		System.out.printf("�ִ� �� = %d \n", max);
		System.out.printf("�ּڰ� = %d", min);
		
		
	}

}
