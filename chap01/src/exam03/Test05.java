package exam03;

public class Test05 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		int result1 = b1 + b2; //result1를 byte로 하지 않기
		
		System.out.println("result1 = " + result1);
		
		char ch1 = 'A';
		char ch2 = 1;
		int result2 = ch1 + ch2; //result2를 char로 하지 않기
		
		System.out.println("result2 = " + result2);
		System.out.println("result2 = " + (char)result2);
	}

}
