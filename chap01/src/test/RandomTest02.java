package test;
//101~999����:n ,n�� 10�� ���� ���
import java.util.Random;
public class RandomTest02 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num1 = 101+ran.nextInt(899);
		
		System.out.printf("%d\n", num1);
		System.out.printf("%d\n", num1*10);
		System.out.printf("%d\n", num1%10);
		
		
	}

}
