package ex04;

public class CalculatorTest {

	public static void main(String[] args) {
		
		System.out.printf("덧셈 결과: %d \n", Calculator.plus(5, 3));		//Calculator 클래스의 plus 정적 함수에 접근해 5와 3을 덧셈 결과 출력
		System.out.printf("뺄셈 결과: %d \n", Calculator.minus(5, 3));	//Calculator 클래스의 minus 정적 함수에 접근해 5와 3을 뺄셈 결과 출력
		System.out.println("원의 넓이: " + Calculator.areaCircle(10));	//Calculator 클래스의 areaCircle 정적 함수에 접근해 반지름 10인 원의 넓이 결과 출력
	}

}
