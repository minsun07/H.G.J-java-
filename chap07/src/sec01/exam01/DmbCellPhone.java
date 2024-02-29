package sec01.exam01;

public class DmbCellPhone extends CellPhone {

	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		//super(); 자동으로 추가됨
		this.model = model;  //Dmb 클래스가 가지고 있는 필드가 아니지만 CellPhone 클래스를 상속 받았기 때문에 사용 가능하다.
		this.color = color;  //Dmb 클래스가 가지고 있는 필드가 아니지만 CellPhone 클래스를 상속 받았기 때문에 사용 가능하다.
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
