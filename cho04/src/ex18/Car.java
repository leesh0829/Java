package ex18;

public class Car {
	
	int result = 0;
	
	Tire fl = new Tire("왼쪽 앞", 6);		//부모 클래스 타입 필드 - 부모객체, 자식 개체
	Tire fr = new Tire("오른쪽 앞", 2);
	Tire bl = new Tire("왼쪽 뒤", 3);
	Tire br = new Tire("오른쪽 뒤", 4);
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	int run() {
		System.out.println("자동차가 달립니다.");
		
		if(fl.roll() == false) {
			stop();
			result = 1;
		}
		
		if(fr.roll() == false) {
			stop();
			result = 2;
		}
		
		if(bl.roll() == false) {
			stop();
			result = 3;
		}
		
		if(br.roll() == false) {
			stop();
			result = 4;
		}
		
		return result;
	}
}
