package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;  //tv가 RemoteControl 인터페이스를 구현하고있기 때문에 가능하다..
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Searchable searchable = tv; //tv가 Searchable 인터페이스를 구현하고있기 때문에 가능하다..
		searchable.search("http://www.naver.com");
		

	}

}
