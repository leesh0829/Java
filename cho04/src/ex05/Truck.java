package ex05;

public class Truck {

int speed;
	
public void run()
{
	System.out.println("�ü� " + speed + "km/h�� �޸��� �ֽ��ϴ�.");
}
	
	public static void main(String[] args) {
		//speed = 60;
		//run();
		
		Truck cal = new Truck();
		
		cal.speed = 60;
		cal.run();
	}

}
