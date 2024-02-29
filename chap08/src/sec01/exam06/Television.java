package sec01.exam06;

public class Television implements RemoteControl{  //구현 객체
	
	//메소드
	private int voluem;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.voluem = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.voluem = RemoteControl.MIN_VOLUME;
		}
		else {
			this.voluem = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.voluem);
		
	}

}
