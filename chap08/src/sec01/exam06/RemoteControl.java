package sec01.exam06;

public interface RemoteControl {
	
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);

}
