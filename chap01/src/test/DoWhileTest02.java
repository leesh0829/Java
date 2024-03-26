package test;
//입력받은 양의 정수 자릿수 구하는 프로그램 do while 문
import java.util.Scanner;

public class DoWhileTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력");
		
		int a = scan.nextInt();
		int b = 1;
		int c = 0;
		int d;
		
		System.out.printf("입력 정수: %d", a);
		
		do {
			d = a/b;
			c++;
			b *= 10;
		}while(a != 0);
		System.out.printf("%d는 %d자리 정수", c-1);
	}

}
