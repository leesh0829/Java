package ex02;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("�غ���");
		
		myCar.setSpeed(10);
		myCar.run();
		
		System.out.println("--------------------");
		
		Car yourCar = new Car("�ž���");
		
		yourCar.setSpeed(20);
		yourCar.run();
		
	}

}
