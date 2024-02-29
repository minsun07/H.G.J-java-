package sec02.exam02;

public class Anonymous {

	//필드 선언 할 때 인터페이스 사용 가능
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};  
	
	//로컬 변수를 사용할 때 인터페이스를 사용 가능
	void method1() { 
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		}; 
		
		localVar.turnOn();
		localVar.turnOff();
		
	}
	
	//매개변수로 인터페이스 타입 사용 가능
	void method2(RemoteControl rc) { 
		rc.turnOn();
		rc.turnOff();
	}
}
