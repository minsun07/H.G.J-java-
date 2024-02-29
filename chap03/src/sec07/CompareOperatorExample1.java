package sec07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 10;
		boolean r1 = (num1 == num2);
		boolean r2 = (num1 != num2);
		boolean r3 = (num1 <= num2);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		char c1 ='A';
		char c2 = 'B';
		boolean r4 = (c1 < c2);
		
		System.out.println(r4);
	}

}
