package exam08;
// 문자열 비교 연산
public class OperatorTest02 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";//문자열 리터럴로 만들어진 개체는 중복되서 안만들어짐
		String str3 = new String("java"); //new 연산자는 새로운 개체를 생성
		String str4 = "JAVA";
		
		boolean b1 = (str1 == str2); //주소 비교이고 문자열 비교 아님
		boolean b2 = (str1 == str3); //주소 비교이고 문자열 비교 아님
		boolean b3 = (str1.equals(str3)); //주소 비교이고 문자열 비교 아님
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
