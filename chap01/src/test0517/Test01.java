//���� -20 ~ 20 ���̿� ���� 3���� �߻����� �ִ񰪰� �ּڰ��� ã���ÿ�(���ǹ� ���)
package test0517;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int a = -20+rand.nextInt(41);
		int b = -20+rand.nextInt(41);
		int c = -20+rand.nextInt(41);
		
		int max = a;
		int min = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		if(max < b)	max = b;
		if(min > c)	min = c;
		
		if(min > b) min = b;
		if(max < c) max = c;
		
		System.out.printf("�ִ� �� = %d \n", max);
		System.out.printf("�ּڰ� = %d", min);
		
	}

}
