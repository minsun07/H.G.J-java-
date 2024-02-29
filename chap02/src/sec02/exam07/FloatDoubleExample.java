package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//실수값 저장
		float var1 = 3.14f;
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		//정밀도 테스트
		float var4 = 0.12345678901234567890f;
		double var5 = 0.12345678901234567890;
		
		System.out.println(var4);
		System.out.println(var5);
		
		
		//e사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		
		System.out.println(var6);
		System.out.println(var7);

	}

}
