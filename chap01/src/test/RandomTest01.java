package test;
//Random Ŭ������ �̿��Ͽ� ���ڸ� ���� ���� �߻��ϱ�, �� �ڸ� ���� ���� �߻��ϱ�, �� �ڸ� ���� ���� �߻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
