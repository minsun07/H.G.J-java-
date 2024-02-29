package sec06.exam05.package1;

public class B {
	
	//생성자
	public B(){
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
