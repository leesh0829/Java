package test;
//random 구해서 -20~20정수 그거 절댁ㅄ구하는거 ifelse문
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
			
		System.out.printf("절대값: %d", result);
	}

}
