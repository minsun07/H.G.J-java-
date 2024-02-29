package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent parent = new Child();  //자식->부모_자동타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent;  //부모->자식_강제타입변환
		child.field2 = "data2";
		child.method3(); 

	}

}
