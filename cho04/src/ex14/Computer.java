package ex14;

public class Computer extends Calculator{
	@Override
	public void Area(int radius) {
		super.Area(radius);
		System.out.println("Computer 객체의 area() 메소드 실행");
		System.out.println("원 넓이: " + Math.PI * radius * radius);
		
	}
}
