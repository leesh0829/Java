package exam03;
//문자열을 기본타입으로 변환하기
public class Test07 {

	public static void main(String[] args) {
		String str1 = "123";
		byte b1 = Byte.parseByte(str1);
		short s1 = Short.parseShort(str1);
		int num1 = Integer.parseInt(str1);
		int result1 = b1 + s1;
		
		System.out.println("b1 = " + b1);
		System.out.println("result1 = " + result1);
		System.out.println("num1 = " + num1);
		
	}

}
