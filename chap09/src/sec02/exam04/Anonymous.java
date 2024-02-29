package sec02.exam04;

public class Anonymous {

	
	private int field;
	
	public void method(final int arg1, int arg2) {//final 붙여도 되고 안 붙여도 됨
		int var1 = 0;							  //매개변수랑 로컬 변수만 final이 붙음
		int var2 = 0;
		
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
