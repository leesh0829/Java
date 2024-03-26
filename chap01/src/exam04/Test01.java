package exam04;
//string 클래스애 저장돤 문자열을 기본 타입으로 변환하기
public class Test01 {

	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "123";
		String str3 = str1 + str2; //문자열 결합염산: 123123
		
		byte b1 = Byte.parseByte(str1);
		byte b2 = Byte.parseByte("75");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt("32");
		
		double d1 = Double.parseDouble(str2);
		double d2 = Double.parseDouble("23.5");
		
		System.out.println("d1 + d2 = " + (d1 + d2)); //산술연산 후 문자열 결합 연산
		System.out.println("d1 + d2 = " + d1+d2); //문자열 결합 연산
		System.out.println(d1+d2); //산술연산
	}

}
