package exam13;
//62page 11
import java.util.Scanner;
public class Foreach03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���: ");
		
		int a = scan.nextInt();
		
		int[] b = new int[a];
		
		System.out.print("�迭�� ���� �׸��� �Է��Ͻÿ�: ");
		
		for(int i = 0; i < a; i++)
			b[i] = scan.nextInt();
		
		int max = b[0];
		
		for(int d : b)
			max = d;
		
		System.out.printf("�迭 �׸� ���� �ִ�: %d", max);
		
	}

}
