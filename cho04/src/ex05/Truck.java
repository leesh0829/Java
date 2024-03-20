package ex05;

public class Truck {

int speed;
	
public void run()
{
	System.out.println("시속 " + speed + "km/h로 달리고 있습니다.");
}
	
	public static void main(String[] args) {
		//speed = 60;
		//run();
		
		Truck cal = new Truck();
		
		cal.speed = 60;
		cal.run();
	}

}
