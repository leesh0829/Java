package ex01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new TV();
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println("--------------");
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(0);
		rc.setVolume(7);
		rc.turnOff();
	}

}
