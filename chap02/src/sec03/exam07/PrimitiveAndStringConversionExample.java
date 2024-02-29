package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		double i = 3.5;
		double j = 2.7;
		double result = i+j;
		System.out.println(result );
		
		/*
		 * 문자형으로 바꿀때는 숫자 이외의 숫자가 들어오면 오류가 난다.
		 */String str = "1a"; int val = Integer.parseInt(str); System.out.println(val);
		 
		
	}

}
