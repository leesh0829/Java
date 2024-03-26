package exam04;
//기본 타입 값을 문자열로 변환하기: String 클래스에 있는 valueOf()메소드 사용
public class Test02 {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 35;
		String str1 = String.valueOf(num1);
		String str2 = String.valueOf(num2);
		
		
		String str3 = str1 + str2;
		int result = num1 + num2;
		
		System.out.println(str3);
	}

}
