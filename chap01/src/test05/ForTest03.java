package test05;
import java.util.Random;
//Random -10~10 음수인경ㅇ 0까지 카운트 업 양수인경우 0까지 카운트 다운

public class ForTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = -10+ran.nextInt(20);
		int i;
		
		System.out.printf("난수:%d\n", a);
		if(a>0) {
			System.out.println("카운트 다운");
			for(i=a; i>=0; i--) 
				System.out.printf("%d\n", i);
		}
		else {
			System.out.println("카운트업");
			for(i=a; i<=0; i++) 
				System.out.printf("%d\n", i);
		}
	}

}
