package sec01.verify.exam04;

public class Child extends Parent{

	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //요거를 써야합니다.무조건!!!
		this.name = name;
		this.studentNo = studentNo;
	}
}
