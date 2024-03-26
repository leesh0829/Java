package exam05;
//Scanner 클래스를 이용해서 키보드로 데이터 입력받기
import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두개의 정수 입력 해 줘");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		int min = num1 - num2;
		int time = num1  * num2;
		double vidi = num1 / (float)num2; //int끼리 연산하면 int값이 나오므로 하나 이상을 큰 실수 형태로 만들어야함
		
		System.out.printf("result = %d\n", sum);
		System.out.printf("result = %d\n", min);
		System.out.printf("result = %d\n", time);
		System.out.printf("result = %.3f\n", vidi); //여섯자리 까지 쓸거 아니니깐 소수점 세자리 까지
		
		
	}

}
