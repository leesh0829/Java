package exam1;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("���");
		Car c3 = new Car("���", "������");
		Car c4 = new Car("����", "��", 250);
		
		System.out.println("car1 ����ȸ��: " + c1.company);
		System.out.println("car1 ��: " + c1.model);
		System.out.println("car1 ����: " + c1.color);
		System.out.println("car1 �ְ� �ӵ�: " + c1.maxspeed);
		System.out.println("----------");
		System.out.println("car2 ����ȸ��: " + c2.company);
		System.out.println("car2 ��: " + c2.model);
		System.out.println("car2 ����: " + c2.color);
		System.out.println("car2 �ְ� �ӵ�: " + c2.maxspeed);
		System.out.println("----------");
		System.out.println("car3 ����ȸ��: " + c3.company);
		System.out.println("car3 ��: " + c3.model);
		System.out.println("car3 ����: " + c3.color);
		System.out.println("car3 �ְ� �ӵ�: " + c3.maxspeed);
		System.out.println("----------");
		System.out.println("car4 ����ȸ��: " + c4.company);
		System.out.println("car4 ��: " + c4.model);
		System.out.println("car4 ����: " + c4.color);
		System.out.println("car4 �ְ� �ӵ�: " + c4.maxspeed);
	}

}
