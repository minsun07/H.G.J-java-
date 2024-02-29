package sec05.exam04;

public class Singleton {
	
	//정적 필드
	private static Singleton s = new Singleton();
	
	private Singleton(){ }  //생성자 
	
	//정적 메소드
	static Singleton getInstance() {
		return s;
	}

}
