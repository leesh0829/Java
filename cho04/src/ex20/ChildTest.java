package ex20;

public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();	//자동 타입 변환
		
		p.f1 = "data";	//부모 클래스에 있는 메소드, 필드 사용 가능
		p.m1();
		p.m2();	//자식 클래스에 있지만, 재정의 된 메소드, 필드 사용가능
		
		//p.f2 = "base";	//자식 클래스 사용 X
		//p.m3();
		
		Child ch = (Child)p;	//강제 타입 변환 
		ch.f2 = "yyy";	//자식 클래스
		ch.m3();	//자식 클래스
		
		p.f1 = "ronaldo";
		p.m1();
	}

}
