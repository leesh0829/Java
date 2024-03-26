package exam05;
//Random 클래스 사용하여 난수 발생하기
import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		Random rand = new Random(); //Random 객체 생성
		
		/*for(int i=0; i<10; i++)
		{
			int num = 1+rand.nextInt(10); //0~9까지 난수 출력 1+추가시 1~10
			System.out.println("num = " + num);
		}*/
		
		for(int i=0; i<10; i++)
		{
			int num = 10+rand.nextInt(90); //10~99
			System.out.println("num = " + num);
		}
	}

}
