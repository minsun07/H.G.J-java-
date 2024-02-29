package sec09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
	
		int cc = 'A';//65
		
		if((cc>=65)&(cc<=90)) {
			System.out.println("대문자군요");
		}
		if((cc>=97)&&(cc<122)) {
			System.out.println("소문자군요");
		}
		if(!(cc<48) && !(cc>57)) {
			System.out.println("0~9숫자군요");
		}
		
		int v = 6;
		if((v%2==0)|(v%3==0)) {
			System.out.println("2또는 3의 배수군요");
		}
		if((v%2==0||(v%3==0))) {
			System.out.println("2또는 3의 배수군요");
		}

	}

}
