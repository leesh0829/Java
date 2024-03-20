package ex07;

public class Driver {
	
	public void drive(Vehicle vh) {
		if(vh instanceof Bus) {
			Bus bus = (Bus)vh;
			bus.checkFare();
		}
		vh.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver dr = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		dr.drive(bus);
		dr.drive(taxi);
	}

}
