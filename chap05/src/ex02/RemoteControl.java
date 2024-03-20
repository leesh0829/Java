package ex02;

public interface RemoteControl {
	
	final int MAX_VOLUME = 10;
	final int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public abstract void setVolume(int vol);
}
