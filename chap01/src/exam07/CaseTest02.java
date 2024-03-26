package exam07;

import java.util.Random;

public class CaseTest02 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = 1+ran.nextInt(12);
		
		switch(a)
		{
		case 3:
		case 4:
		case 5:
			System.out.printf("%d월은 봄입니다.", a);
			break;
		case 6:
		case 7:
		case 8:
			System.out.printf("%d월은 여름입니다.", a);
			break;
		case 9:
		case 10:
		case 11:
			System.out.printf("%d월은 가을입니다.", a);
			break;
		case 12:
		case 1:
		case 2:
			System.out.printf("%d월은 겨울입니다.", a);
			break;
			
		}
	}

}
