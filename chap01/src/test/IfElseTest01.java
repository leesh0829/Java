package test;
//random ���ؼ� -20~20���� �װ� ���줴���ϴ°� ifelse��
import java.util.Random;
public class IfElseTest01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int score = -20+ran.nextInt(41);
		int result;
		
		if(score < 0)
			result = -score;
		else
			result = score;
			
		System.out.printf("���밪: %d", result);
	}

}
