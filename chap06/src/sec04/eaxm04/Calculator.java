 package sec04.eaxm04;

public class Calculator {
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result1 = sum / 2;
		return result1;
	}
	
	void execute() {
		double result2 = avg(7,10);
		println("실행결과 : " + result2);
	}
	
	void println(String message) {  //String타입의 매개변수를 받겠다.
		System.out.println(message);
	}

}
