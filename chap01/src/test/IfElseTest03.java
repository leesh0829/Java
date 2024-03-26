package test;
//1~40난수 짝수,홀수 판별
import java.util.Random;
public class IfElseTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num = 1+ran.nextInt(40);
		
		if(num%2 == 1)
			System.out.printf("%d는 홀수입니다.", num);
		else
			System.out.printf("%d는 짝수입니다", num);
	}

}
