package exam03;
//산술연산에서의 타입변환
public class Test03 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 30;
		long ln1 = 300l;
		float f1 = 0.3f;
		
		int sum1 = b1 + b2; // byte, short, int가 산술연산에 참여하면 int타입으로 타입변환되어 산술해야한다
		long sum2 = b3 + ln1;
		float sum3 = ln1 + f1;
		
		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("sum3 = " + sum3);
		
		
	}

}
