package ex03;

public class TV implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�.");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ŵ�ϴ�.");
	}
	
	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub
		if( vol > RemoteControl.MAX_VOLUME )
			vol = RemoteControl.MAX_VOLUME;
		else if( vol < RemoteControl.MIN_VOLUME )
			vol = RemoteControl.MIN_VOLUME;
		else
			volume = vol;
		System.out.println("���� TV�� ����: " + volume);
	}
}
