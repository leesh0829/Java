package exam1;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("H");
		Vehicle v2 = new Vehicle("KIA", "TAXI", "��Ȳ");
		Vehicle v3 = new Vehicle("KIA", "TRUCK", "�Ķ���");
		
		
		System.out.println("v1 �����ü " + v1.company);
		System.out.println("v1 ���� " + v1.kind);
		System.out.println("v1 ���� " + v1.color);
		System.out.println("--------------");
		System.out.println("v2 �����ü " + v2.company);
		System.out.println("v2 ���� " + v2.kind);
		System.out.println("v2 ���� " + v2.color);
		System.out.println("--------------");
		System.out.println("v3 �����ü " + v3.company);
		System.out.println("v3 ���� " + v3.kind);
		System.out.println("v3 ���� " + v3.color);
		System.out.println("--------------");
	}

}
