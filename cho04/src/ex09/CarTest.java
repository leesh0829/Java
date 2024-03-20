package ex09;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car(); //인스턴스 객체를 가져오기 위해 객체 참조
		
		System.out.printf("현재 속도: %d km/h \n", c.getSpeed());
		
		c.setSpeed(50);
		
		System.out.printf("현재 속도: %d km/h\n", c.getSpeed());
		
		c.setSpeed(-50);
		
		System.out.printf("현재 속도: %d km/h\n", c.getSpeed());
		
		c.setStop(false);
		
		System.out.printf("현재 stop: %b\n", c.isStop());
		
	}

}
