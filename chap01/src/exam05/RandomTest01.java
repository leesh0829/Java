package exam05;
//Random Ŭ���� ����Ͽ� ���� �߻��ϱ�
import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		Random rand = new Random(); //Random ��ü ����
		
		/*for(int i=0; i<10; i++)
		{
			int num = 1+rand.nextInt(10); //0~9���� ���� ��� 1+�߰��� 1~10
			System.out.println("num = " + num);
		}*/
		
		for(int i=0; i<10; i++)
		{
			int num = 10+rand.nextInt(90); //10~99
			System.out.println("num = " + num);
		}
	}

}
