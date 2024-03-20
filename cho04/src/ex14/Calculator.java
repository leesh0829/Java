package ex14;

public class Calculator { //PI값은 3.14159
	double pi = 3.14159;
	int radius;
	public void Area(int radius) {
		System.out.println("Calculator 객체의 area() 메소드 실행");
		System.out.println("원 넓이: " + 3.14159 * radius * radius);
	}
}
