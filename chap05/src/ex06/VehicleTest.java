package ex06;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vc = new Bus();
		
		vc.run();
		//vc.checkFare();
		
		Bus bus = (Bus)vc;
		bus.run();
		bus.checkFare();
		}
}
