package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//객체 생성
		Car myCar = new Car();
		
		
		System.out.println("회사명 : "+myCar.company);
		System.out.println("색상 : "+myCar.color);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("현재 속독 : "+myCar.speed);
		System.out.println("최대 속도 : "+myCar.maxSpeed);
		
		//필드 수정
		myCar.speed = 30;
		System.out.println("수정 속도 : " + myCar.speed);

	}

}
