package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "0110225-234567");  //객체
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("김자바", "123456-123456");  //객체
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}
