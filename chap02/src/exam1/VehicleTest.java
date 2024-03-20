package exam1;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("H");
		Vehicle v2 = new Vehicle("KIA", "TAXI", "주황");
		Vehicle v3 = new Vehicle("KIA", "TRUCK", "파랑색");
		
		
		System.out.println("v1 생산업체 " + v1.company);
		System.out.println("v1 차종 " + v1.kind);
		System.out.println("v1 색상 " + v1.color);
		System.out.println("--------------");
		System.out.println("v2 생산업체 " + v2.company);
		System.out.println("v2 차종 " + v2.kind);
		System.out.println("v2 색상 " + v2.color);
		System.out.println("--------------");
		System.out.println("v3 생산업체 " + v3.company);
		System.out.println("v3 차종 " + v3.kind);
		System.out.println("v3 색상 " + v3.color);
		System.out.println("--------------");
	}

}
