package ex09;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car(); //�ν��Ͻ� ��ü�� �������� ���� ��ü ����
		
		System.out.printf("���� �ӵ�: %d km/h \n", c.getSpeed());
		
		c.setSpeed(50);
		
		System.out.printf("���� �ӵ�: %d km/h\n", c.getSpeed());
		
		c.setSpeed(-50);
		
		System.out.printf("���� �ӵ�: %d km/h\n", c.getSpeed());
		
		c.setStop(false);
		
		System.out.printf("���� stop: %b\n", c.isStop());
		
	}

}
