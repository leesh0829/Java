package test05;
import java.util.Random;
//Random -10~10 �����ΰ椷 0���� ī��Ʈ �� ����ΰ�� 0���� ī��Ʈ �ٿ�

public class ForTest03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = -10+ran.nextInt(20);
		int i;
		
		System.out.printf("����:%d\n", a);
		if(a>0) {
			System.out.println("ī��Ʈ �ٿ�");
			for(i=a; i>=0; i--) 
				System.out.printf("%d\n", i);
		}
		else {
			System.out.println("ī��Ʈ��");
			for(i=a; i<=0; i++) 
				System.out.printf("%d\n", i);
		}
	}

}
