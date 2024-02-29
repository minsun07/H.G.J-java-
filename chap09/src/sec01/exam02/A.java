package sec01.exam02;

public class A {

	class B {}
	static class C {}
	
	//B와 C를 A클래스 내부에서 사용하는 방법 
	//1. 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//2. 인스턴스 메소드
	void mehtod1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//3.정적 필드 초기화
	//static B fiedl3 = new B(); //에러 이유: B는 인스턴스 클래스이기 때문에 A가 있어야 B를 사용할 수있다.
	static C field4 = new C();
	
	//4. 정적 메소드
	static void method2() {
		//B car1 = new B(); //에러 이유: B는 인스턴스 클래스이기 때문에 A가 있어야 B를 사용할 수있다.
		C var2 = new C(); 
	}
}
