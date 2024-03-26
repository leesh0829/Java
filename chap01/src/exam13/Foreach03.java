package exam13;
//62page 11
import java.util.Scanner;
public class Foreach03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세여: ");
		
		int a = scan.nextInt();
		
		int[] b = new int[a];
		
		System.out.print("배열에 넣을 항목값을 입력하시오: ");
		
		for(int i = 0; i < a; i++)
			b[i] = scan.nextInt();
		
		int max = b[0];
		
		for(int d : b)
			max = d;
		
		System.out.printf("배열 항목 값의 최댓값: %d", max);
		
	}

}
