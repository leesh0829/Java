package test;

import java.util.Random;

//Random 정수 두개 입력 차가 10 이상 두 차 숫자 비교
public class RandomTest04 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = -20+ran.nextInt(40);
		int b = -20+ran.nextInt(40);
		int result = (a>b) ? a-b : b-a; //0
		
		System.out.printf("%d와 %d의", a, b);
		
		/*if(a<b)
			result = b-a;
		else 
			result = a-b; */
		
		System.out.printf("차는 \"%d\"이고, ", result);
		
		if(result > 10)
			System.out.printf("두 수는 \"10\"이상 차이가 난다.");
		else
			System.out.printf("두 수는 \"10\"미만 차이가 난다.");
	}

}
