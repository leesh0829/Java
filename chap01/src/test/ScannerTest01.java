package test;
//Scanner로 3자리의 정수를 입력 받아 마지막 자릿수를 제외한 값과 마지막 자릿수를 실행결과와 같이 출력되도록 프로그램을 작성하시오.
import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫 값 입력: ");
		
		int num1 = scan.nextInt();
		
		int h = num1 / 10;
		int m = num1 % 10;
		
		System.out.printf("마지막 자리를 제외한 숫자: %d\n", h);
		System.out.printf("마지막 자리 숫자: %d", m);
		
	}

}
