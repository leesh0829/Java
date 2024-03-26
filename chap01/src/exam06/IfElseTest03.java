package exam06;
//Random 1~20 정수 3개 중간값찾기
import java.util.Random;
public class IfElseTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = 1+ran.nextInt(20);
		int b = 1+ran.nextInt(20);
		int c = 1+ran.nextInt(20);
		int mid = b;
		
		if(a>b) {
			if(b<c) {
				if(a>c)
					mid = c;
				else//a<c
					mid = a;
			}
			else //b>c
				mid = b;
		}
		else if(a<b) {
			if(a<c) {
				if(b>c) 
					mid = c;
				else//b<c
					mid = b;
			}
			else//a>c
				mid = a;
		}
		
		System.out.printf("%d %d %d의 중간값은 %d이다.", a, b, c, mid);
	}

}
