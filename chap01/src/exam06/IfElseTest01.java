package exam06;
//Scanner로 점수 입력받고 if-else이용해 60점이상시 합격 60점 미만시 불합격
import java.util.Scanner;
public class IfElseTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력>>");
		
		int score = scan.nextInt();
		
		if(score <= 60)
		{
			System.out.printf("당신의 점수는 %d입니다. \"합격\"을 축하합니다.\n", score);
		}
		else
		{
			System.out.printf("당신의 점수는 %d입니다. \"불합격\"을 축하합니다.\n", score);
			System.out.println("재도전하세요.");
		}
		
		System.out.println("수고하셨습니다.");
	}

}
