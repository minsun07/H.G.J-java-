package sec06.exam05.package2;

  
import sec06.exam05.package1.A;

public class C {
	
	//생성자
	public C(){
		A a = new A();
		a.field = 10;
		a.method();
	}
	
	//Method
	public void method() {
		A a = new A();
		a.field = 10;
		a.method();
	}

}
