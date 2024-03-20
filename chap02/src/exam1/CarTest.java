package exam1;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("쏘울");
		Car c3 = new Car("모닝", "베이지");
		Car c4 = new Car("레이", "블랙", 250);
		
		System.out.println("car1 생산회사: " + c1.company);
		System.out.println("car1 모델: " + c1.model);
		System.out.println("car1 색상: " + c1.color);
		System.out.println("car1 최고 속도: " + c1.maxspeed);
		System.out.println("----------");
		System.out.println("car2 생산회사: " + c2.company);
		System.out.println("car2 모델: " + c2.model);
		System.out.println("car2 색상: " + c2.color);
		System.out.println("car2 최고 속도: " + c2.maxspeed);
		System.out.println("----------");
		System.out.println("car3 생산회사: " + c3.company);
		System.out.println("car3 모델: " + c3.model);
		System.out.println("car3 색상: " + c3.color);
		System.out.println("car3 최고 속도: " + c3.maxspeed);
		System.out.println("----------");
		System.out.println("car4 생산회사: " + c4.company);
		System.out.println("car4 모델: " + c4.model);
		System.out.println("car4 색상: " + c4.color);
		System.out.println("car4 최고 속도: " + c4.maxspeed);
	}

}
