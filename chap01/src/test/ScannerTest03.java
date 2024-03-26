package test;
//Scanner로 정수 입력 받고 입력받은 정수가 만약 25면 25의 +-5값 난수 수하기
import java.util.Scanner;
import java.util.Random;
public class ScannerTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("입력");
		
		int num = scan.nextInt();
		int num2 = -5+num+ran.nextInt(11+num);
		
		System.out.printf("%d", num2);
	}

}
