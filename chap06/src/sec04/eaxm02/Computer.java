package sec04.eaxm02;

public class Computer {
	
	
	//메소드 생성
	int sum1(int[] values) {  //매개 변수로 배열이 들어간 메소드
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... valuse) {
		int sum = 0;
		for(int i=0; i<valuse.length; i++) {
			sum += valuse[i];
		}
		return sum;
	}
	
	
	
	

}
