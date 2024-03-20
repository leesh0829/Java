package ex02;

public class Car {
	String model;
	int speed;
	
	public Car(String model) {
		this.model = model; 
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void run() {
		if(speed <= 50) {
			for(int i = speed; i <= 50; i+=10) {
				this.setSpeed(i);
				System.out.printf("%s 달립니다.(시속 : %dkm/h) \n",model, i);
			}
		}
		
	}
}
