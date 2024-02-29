package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car(); //객체 생성
		System.out.println("company : " + car1.company);
		System.out.println("model : " + car1.model);
		System.out.println("color : " + car1.color);
		System.out.println("maxSpeed : " + car1.maxSpeed);
		
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("company : " + car2.company);
		System.out.println("model : " + car2.model);
		System.out.println("color : " + car2.color);
		System.out.println("maxSpeed : " + car2.maxSpeed);
		
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("company : " + car3.company);
		System.out.println("model : " + car3.model);
		System.out.println("color : " + car3.color);
		System.out.println("maxSpeed : " + car3.maxSpeed);
		
		System.out.println();
		
		Car car4 = new Car("택시", "노랑", 200);
		System.out.println("company : " + car4.company);
		System.out.println("model : " + car4.model);
		System.out.println("color : " + car4.color);
		System.out.println("maxSpeed : " + car4.maxSpeed);
		
		
		

	}

}
