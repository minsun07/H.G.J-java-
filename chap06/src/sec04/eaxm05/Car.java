package sec04.eaxm05;

public class Car {
	
	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50; i++) {
			speed = i;
			System.out.println("달립니다.(시속: " + speed + "km/h)");
		
		}
	}

}
