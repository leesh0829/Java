package test;
//1~40���� ¦��,Ȧ�� �Ǻ�
import java.util.Random;
public class IfElseTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num = 1+ran.nextInt(40);
		
		if(num%2 == 1)
			System.out.printf("%d�� Ȧ���Դϴ�.", num);
		else
			System.out.printf("%d�� ¦���Դϴ�", num);
	}

}
