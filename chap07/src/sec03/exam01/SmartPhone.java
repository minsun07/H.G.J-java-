package sec03.exam01;

public class SmartPhone extends Phone{
	
	
	//생성자
	public SmartPhone(String owner) { //Phone 클래스를 new로 불러올 수 없기 때문에 생성자가 없다. 그래서 생성자를 만들어 주어야한다.
		super(owner);         //SmartPhone에서도 외부 데이터를 받아와야하기 때문에 String owner을 받아온다. 그것을 super에 넣는다.
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터냇 검색을 합니다.");
	}

}
