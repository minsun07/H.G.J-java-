package sec01.exam06;

public class MyClass {
	//Field
	//필드의 타입으로도 인터페이스를 사용할 수 있다.
	RemoteControl rc = new Television();
	
	//Constructor
	MyClass(){  //기본 생성자
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(6);
	}
	
	//Method
	void methodA() {
		RemoteControl rc = new Audio();  //Audio 구현 객체 생성
		rc.turnOn();
		rc.setVolume(5);
		
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(1);
		
	}
	
}
