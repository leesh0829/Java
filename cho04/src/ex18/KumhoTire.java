package ex18;

public class KumhoTire  extends Tire {
	
	KumhoTire(String l, int m) {
		super(l, m);	//Tire 클래스의 생성자 호출
	}
	
	
	boolean roll() {	//Tire의 수명을 출력, Tire의 수명이 남을 시 True를, 펑크가 났다면 False출력
		accum++;
	
		if(accum < max) {
			System.out.println(location + " KumhoTire " + "남은 수명: " + (max-accum));
			return true;
		}
		else {
			System.out.println(location + "금호 타이어 펑크");
			return false;
		}
	}
	
}
