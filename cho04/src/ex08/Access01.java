package ex08;

public class Access01 {

	public static void main(String[] args) {
		Sample01 sam = new Sample01(); //객체 생성 다른 클래스이기 때문
		
		sam.a = 10;	//public은 객체 생성만 하면 가능
		//sam.b = 20;	//private는 같은 클래스 내부만 가능
		sam.c = 30;	//default는 같은 패키지이면 가능
	}
}
