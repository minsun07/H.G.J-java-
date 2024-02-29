package sec01.exam06;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	public void stop() {   //final이 붙은 메소드는 재정의가 안됨.
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	
	

}
