package sec01.exam06;

public class Car {
	//field
	public int speed;
	
	//method
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {  //Car의 자식 클래스에서는 stop메소드를 재정의하지 말아라.
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
