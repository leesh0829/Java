package exam02;
//exam02 패키지 안에 Test01클래스가 들어가있음.

public class Test01 {

	public static void main(String[] args) { //메인()메소드 블럭  클래스가 실행 클래스인 경우 반드시 메인()메소드 필요
		//byte b1 = 12;
		//byte b2 = 127; //-7 ~ 127까지 
		short s1 = 12;
		int x1 = 12;
		int x2 = 0b1100; //B도 가능
		int x3 = 014; 
		int x4 = 0xc; //C도 가능
		//int x5 = 2200000000; //21억 얼마까지 저장
		long x5 = 2200000000l; //long 뒤에는 l붙여야 함
		int x6 = 'a'; //유니코드 0 ~ 65535
		char c1 = 69; //char 숫자입력 가능
		char c2 = '\u0041'; //16진수
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		System.out.println("x5 = " + x5);
		System.out.println("x6 = " + x6);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}

}
