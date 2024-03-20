package ex01;

public class CarTest {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.printf("∞°Ω∫ ¿‹∑Æ: %d \n", myCar.gas);
		myCar.setGas(20);
		System.out.printf("∞°Ω∫ ¿‹∑Æ: %d \n", myCar.gas);
		
		Car yourCar = new Car();
		System.out.printf("∞°Ω∫ ¿‹∑Æ: %d \n", yourCar.gas);
		yourCar.setGas(40);
		System.out.printf("∞°Ω∫ ¿‹∑Æ: %d \n", yourCar.gas);
		
	}
}
