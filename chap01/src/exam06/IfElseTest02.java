package exam06;
//Scanner이용 점수 입력 if else이용 A~F등급 나누기
import java.util.Scanner;
public class IfElseTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력>>");
		
		int score = scan.nextInt();
		
		if(score > 90)
			System.out.print("A등급");
		else if(score > 80)
			System.out.print("B등급");
		else if(score > 70)
			System.out.print("C등급");
		else if(score > 60)
			System.out.print("D등급");
		else if(score > 50)
			System.out.print("E등급");
		else
			System.out.print("F등급");
	}

}
