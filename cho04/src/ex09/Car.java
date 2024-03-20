package ex09;

public class Car {
	private int speed;
	private boolean stop; //클래스 내부만 접근가능
	
	public int getSpeed()
	{
		return speed; //필드 값을 외부로 리턴
	}
	
	public void setSpeed(int speed)
	{
		if(speed < 0)				//외부에 가져온 speed값을 0미만으로 받을시 0으로 정하고, 아닐시 바로 넘기기
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	public boolean isStop() 
	{
		return stop;			//getter 메소드, boolean은 is로 써야함 외부로 리턴
	}
	
	public void setStop(boolean stop)
	{
		if(stop == false)
			this.stop = true;
		else
			this.stop = false;
		speed = 0;
	}
}
