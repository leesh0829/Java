package exam03;

public class Test01 {

	public static void main(String[] args) {
		byte b1 = 100;
		int num1 = b1; //byte에서 int로 자동 타입 변환 발생
		
		byte b2 = 100;
		//char c1 = b2; // byte가 음수까지 포함해서 char는 양수만 가능해서 데이터 타임 변환 X
		
		long ln1 = 200000000l;
		float f1 = ln1;
		System.out.println("f1 = " + f1);
		
		
	}

}
