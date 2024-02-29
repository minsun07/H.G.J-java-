package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//객체를 생성 했을 경우
		driver.drive(bus);
		driver.drive(taxi);
		
		//객체를 생성하지 않은 경우
//		driver.drive(new Bus());
//		driver.drive(new Taxi());
	}

}
