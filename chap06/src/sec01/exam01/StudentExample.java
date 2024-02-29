package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(); //객체 생성
		// s1 == 클래스 변수(참조 변수) , 즉 Studnt은 참조 타입이다.  
		//Student 클래스를 new해서 객체를 생성하고, 그 객체의 번지값(주소)를 참조 타입인 클래스 변수(s1)에 저장한 후, 객체를 사용한다.
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}
