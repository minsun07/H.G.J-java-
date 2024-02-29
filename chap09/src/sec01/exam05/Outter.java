package sec01.exam05;

public class Outter {

	String field = "Outter - field";
	void method() {
		System.out.println("Outter - method");
	}
	
	class Nested{
		String field = "Nested - field";
		void method() {
			System.out.println("Nested - method");
		}
		
		void print() {
			System.out.println(this.field);  //Nested필드를 출력
			this.method();					//Nested메소드를 출력
			System.out.println(Outter.this.field); //바깥 클래스 출력
			Outter.this.method();					//바깥 클래스 출력
		}
	}
}
