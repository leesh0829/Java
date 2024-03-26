package exam03;

public class Test04 {

	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		double result1 = (double)x/y; // 2.5 int타입과 int타입이 산술연산에 참여 하면 결과가 int타입에 저장
		double result2 = x/(double)y; // 2.5
		double result3 = (double)x/(double)y; // 2.5
		double result4 = (double)(x/y); // 2.0
		double result5 = (float)x/y;
		double result6 = x/(float)y;
		float result7 = (float)x/(float)y;
		double result8 = (double)x/(float)y;
		double result9 = (float)x/(double)y;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		System.out.println("result5 = " + result5);
		System.out.println("result6 = " + result6);
		System.out.println("result7 = " + result7);
		System.out.println("result8 = " + result8);
		System.out.println("result9 = " + result9);
	}

}
