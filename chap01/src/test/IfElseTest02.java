package test;
//Random 클래스 -10 ~10 정수 두개받아 큰지 작은지 같은지 비교
import java.util.Random;
public class IfElseTest02 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num1 = -10+ran.nextInt(20);
		int num2 = -10+ran.nextInt(20);
		
		if(num1 > num2)
		{
			System.out.printf("발생된 난수는 %d와 %d이다.\n", num1, num2);
			System.out.printf("%d는 %d보다 크다", num1, num2);
		}
		else if(num1 < num2)
		{
			System.out.printf("발생된 난수는 %d와 %d이다.\n", num1, num2);
			System.out.printf("%d는 %d보다 크다", num2, num1);
		}
		else
		{
			System.out.printf("발생된 난수는 %d와 %d이다.\n", num1, num2);
			System.out.printf("%d와 %d는 같다", num1, num2);
		}
	}

}
