package test;
//Random 클래스를 이용하여 한자리 양의 정수 발생하기, 한 자리 음의 정수 발생하기, 두 자리 양의 정수 발생하는 프로그램을 작성하시오.
import java.util.Random;
public class RandomTest01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num1 = 1+ran.nextInt(10);
		int num2 = -1-ran.nextInt(9);
		int num3 = 10+ran.nextInt(100);
		
		System.out.printf("%d\n", num1);
		System.out.printf("%d\n", num2);
		System.out.printf("%d\n", num3);
		
	}

}
