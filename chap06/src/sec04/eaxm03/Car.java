package sec04.eaxm03;

public class Car {

	//필드
	int gas;
	
	//생성자
		//기본 생성자 사용
	
	//메소드
	void setGas(int gas) {  //set == 변경한다.
		this.gas = gas;
	}
	
	boolean isLeftGas() {   //is의 의미는 '='
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas -= 1;
			}
			else {
				System.out.println("멈춤니다.(gas잔량 :" + gas + ")");
				return; //메소드 실행 종료
			}
		}
	}
}
