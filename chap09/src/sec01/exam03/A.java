package sec01.exam03;

public class A {
	int field1;
	void method1() {} //인스턴트 멤버 메소드
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 2;
			method1();
			
			field2 = 3;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1 = 2;  //A객체가 반드시 있어야하는 이 두 코드는 에러가 난다.
//			method1();
			
			field2 = 3;
			method2();
		}
	}
}
