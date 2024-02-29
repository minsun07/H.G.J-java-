package sec04.eaxm02;

public class CoomputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer(); //객체 생성
		
		int[] values1 = {1, 2, 3};  //매개변수를 배열로 주어진다.
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1,2,3);  //매개변수를 값목록으로 주어진다.
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : "+result4);

	}

}
