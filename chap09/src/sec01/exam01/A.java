package sec01.exam01;

//바깥 클래스
public class A {
	A(){
		System.out.println("A 객체가 생성됨");
	}//A생성자
	
	//인스턴스 멤버 클래스
	class B{
		B(){
			System.out.println("B 객체가 생성됨");
		}//B생성자
		
		int field1;                //인스턴드 필드
		static int field2;
		void mehtod1() {}          //인스턴드 메소드
		static void method2() {}
		
	}//B클래스
	
	//정적 멤버 클래스
	static class C {
		C(){
			System.out.println("C 객체가 생성됨");
		}//C생성자
		int field1;               //인스턴드 필드
		static int field2;        //정적 필드
		void method1() {}         //인스턴드 메소드
		static void method2() {}  //정적 메소드
	}//C클래스
	
	void method() {
		//로컬 클래스
		class D {
			D(){
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			//static int field2;
			void mehtod1() {}
			//static void method2() {}
		}
		//인스턴스 메소드 호출
		D d = new D();
		d.field1 = 3;
		d.mehtod1();
	}

}//A클래스