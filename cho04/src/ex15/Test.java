package ex15;

public class Test {

	public static void main(String[] args) {
		SupersonicAirplane s = new SupersonicAirplane();
		
		s.land();
		
		System.out.println();
		
		s.fly();
		s.flymode = SupersonicAirplane.SUPERSONIC;
		s.fly();
		s.flymode = SupersonicAirplane.NORMAL;
		s.fly();
		
		System.out.println();
		
		s.takeOff();
		
	}

}
