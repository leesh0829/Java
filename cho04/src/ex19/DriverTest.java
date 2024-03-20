package ex19;

public class DriverTest {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Vehicle ve = new Vehicle();
		
		Taxi ta = new Taxi();
		
		Bus bu = new Bus();
		
		d.drive(ve);
		d.drive(ta);
		d.drive(bu);
		
	}

}
