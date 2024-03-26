package exam05;
// Scanner 클래스의 다양한 메소드를 이용하여 데이터 입력 받기  
import java.util.Scanner; // scanner 클래스의 위치를 컴파일러에게 알려주기

public class ScannerTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//scanner 객체 생성하기
		
		System.out.print("인사문을 입력하세요.>>"); //안녕하세여
		
		String str2 = scan.nextLine();
		
		System.out.print("문장을 입력해주세여>>"); //jin dal_rae 2203
		
		String fn = scan.next();
		String name = scan.next();
		int num = scan.nextInt();
		String str1 = scan.nextLine();
		
		
		System.out.printf("성= %s\n", fn);
		System.out.printf("이름= %s\n", name);
		System.out.printf("학번= %d\n", num);
		System.out.printf(str2);
	}

}
