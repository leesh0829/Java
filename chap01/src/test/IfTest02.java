package test;
//3개정수입력 최솟값구하는 if문으로
import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력>>");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int result = num1;
		
		if(num1 > num2)
			result = num2;
		if(result > num3)
			result = num3;
		
		System.out.printf("가장 작은 값: %d", result);
	}

}
