package ex18;

public class Tire {
	
	String location; //Tire 위치
	int max;	//Tire의 최대 수명
	int accum;	//Tire의 누적 회전수
	
	Tire(String location, int max) {
		this.location = location;
		this.max = max;
	}
	
	boolean roll() {	//Tire의 수명을 출력, Tire의 수명이 남을 시 True를, 펑크가 났다면 False출력
		accum++;
	
		if(accum < max) {
			System.out.println(location + " Tire " + "남은 수명: " + (max-accum));
			return true;
		}
		else {
			System.out.println("펑크");
			return false;
		}
	}
}
