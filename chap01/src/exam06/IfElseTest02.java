package exam06;
//Scanner�̿� ���� �Է� if else�̿� A~F��� ������
import java.util.Scanner;
public class IfElseTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է�>>");
		
		int score = scan.nextInt();
		
		if(score > 90)
			System.out.print("A���");
		else if(score > 80)
			System.out.print("B���");
		else if(score > 70)
			System.out.print("C���");
		else if(score > 60)
			System.out.print("D���");
		else if(score > 50)
			System.out.print("E���");
		else
			System.out.print("F���");
	}

}
