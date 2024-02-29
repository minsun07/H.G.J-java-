package sec04.eaxm05;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSeed();
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
