package exam07;

import java.util.Random;

public class CaseTest01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num0 = ran.nextInt(3);
		
		switch(num0)
		{
		case 0:
			System.out.printf("num:%d 가위",num0);
			break;
		case 1:
			System.out.printf("num:%d 바위",num0);
			break;
		case 2:
			System.out.printf("num:%d 보", num0);
			break;
		}
	}

}
