package ex02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV stv = new SmartTV();
		
		RemoteControl rc = stv;
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(5);
		
		Search sc = stv;
		
		sc.urlSearch("https://www.naver.net/");
		
		rc.turnOff();
		
	}

}
