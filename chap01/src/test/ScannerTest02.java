package test;
//Scanner로 두 개의 실수를 입력받아 합과 평균을 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력");
		
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		
		double sum = d1 + d2;
		double ave = (d1 + d2) / 2;
		
		System.out.printf("실수 d1 :%.1f\n", d1);
		System.out.printf("실수 d2: %.1f\n", d2);
		System.out.printf("합계: %.1f\n", sum);
		System.out.printf("평균: %.1f\n", ave);
		
	}

}
