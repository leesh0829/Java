package ex09;

public class Car {
	private int speed;
	private boolean stop; //Ŭ���� ���θ� ���ٰ���
	
	public int getSpeed()
	{
		return speed; //�ʵ� ���� �ܺη� ����
	}
	
	public void setSpeed(int speed)
	{
		if(speed < 0)				//�ܺο� ������ speed���� 0�̸����� ������ 0���� ���ϰ�, �ƴҽ� �ٷ� �ѱ��
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	public boolean isStop() 
	{
		return stop;			//getter �޼ҵ�, boolean�� is�� ����� �ܺη� ����
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
