//58page
package exam13;

public class Array02 {

	public static void main(String[] args) {
		String[] str = new String[4];
		str[0] = "강아지";
		str[1] = "강아지";
		str[2] = "고양이";
		str[3] = new String("강아지");
		
		System.out.println("str[0]의 str[1]의 주소 비교 : " + (str[0] == str[1]));
		System.out.println("str[0]의 str[3]의 주소 비교 : " + (str[0] == str[1]));
		System.out.println("str[0]의 str[1]의 문자열 비교 : " + (str[0].equals(str[3])));
		System.out.println("str[0]의 str[2]의 문자열 비교 : " + (str[0].equals(str[2])));
	}
}
