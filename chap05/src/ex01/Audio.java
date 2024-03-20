package ex01;

public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ Åµ´Ï´Ù.");
	}
	
	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub
		if( vol > MAX_VOLUME )
			vol = MAX_VOLUME;
		else if( vol < MIN_VOLUME )
			vol = MIN_VOLUME;
		else
			volume = vol;
		System.out.println("ÇöÀç AudioÀÇ º¼·ý: " + volume);
	}
}
