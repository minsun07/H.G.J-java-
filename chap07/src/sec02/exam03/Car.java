package sec02.exam03;

public class Car {
	
	//Field
	Tire frontLeftTire = new Tire("앞왼쪽", 6); //클래스에 필요한 데이터를 받아오는 느낌? 4개의 객체(타이어)를 가짐
	Tire frontRightTire = new Tire("앞오른쪽", 2); //타이어의 위치, 최대 회전수(최대 수명)
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRigthTire = new Tire("뒤오른쪽", 4);

	//생성자
	//Method
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRigthTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
