package sec02.exam01;

public class Anonymous {

	//익명 객체를 사용하는 방법
	
	//익명 객체를 필드에 대입할 때
	Person field = new Person() {  //new Person()은 익명 자식 객체
		void work() {  //익명 자식 객체가 가지고 있는 메소드
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		};
	};
	
	
	//메소드 안에서 로컬 변수에 대입되는 객체로 익명 객체를 넣어서 할 수 있다.
	void method1() {  //Anonymous가 가지고 있는 메소드
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	//어떤 매소드의 매개변수 자리에 부모 타입이 있을 경우 익명 객체를 만들어 넣을 수 있다.
	void method2(Person person) {
		person.wake();
	}
}
