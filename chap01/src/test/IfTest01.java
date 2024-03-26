package test;
//Scanner로 정수를 입력받아 음의 값인지 양의정수인지 0인지 구분하는 프로그램을 if문으로 작성
import java.util.Scanner;
public class IfTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("num = ");
		
		int num = scan.nextInt();
		
		if(num > 0)
			System.out.printf("입력된 정수 %d는 양수입니다.", num);
		if(num < 0)
			System.out.printf("입력된 정수 %d는 음수입니다.", num);
		if(num == 0)
			System.out.printf("입력된 정수 %d는 0입니다.", num);
	}

}
