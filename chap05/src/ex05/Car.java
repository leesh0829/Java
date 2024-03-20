package ex05;

public class Car {
	
	Tire fl = new HankookTire();		//부모 클래스 타입 필드 - 부모객체, 자식 개체
	Tire fr = new HankookTire();
	Tire bl = new HankookTire();
	Tire br = new HankookTire();
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	void run() {
		fl.roll();
		fr.roll();
		bl.roll();
		br.roll();
	}
	
	public static void main(String[] args)
	{
		
	}
}
