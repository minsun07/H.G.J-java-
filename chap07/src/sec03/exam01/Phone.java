package sec03.exam01;

public abstract class Phone {

	//Field
	public String owner;
	
	//생성자
	public Phone(String owener) {
		this.owner = owner;
	}
	
	//Method
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
