package sec01.exam01;

public class CellPhone {
	//Field
	String model;
	String color;
	
	//Constructor
	public CellPhone() {
		System.out.println("CellPhone() 호출됨");
	}
	
	//Method
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendvoice(String message) {
		System.out.println("자기 : " + message);
	}
	void receivedVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
