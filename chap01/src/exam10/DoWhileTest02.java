package exam10;

import java.util.Random;

public class DoWhileTest02 {

	public static void main(String[] args) {
		Random ran = new Random(); //랜덤 개체 생성
		int num1 = 1+ran.nextInt(6);
		System.out.printf("주사위 번호:%d\n",num1);
		do {
			num1 = 1+ran.nextInt(6);
			System.out.printf("주사위 번호:%d\n",num1);
		}while(num1 != 6);
		
	}

}
