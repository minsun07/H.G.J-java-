package sec01.exam02;

public class Student extends People{
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);  //부모 생성자에서 값을 받아야하는 조건이라면 꼭 super(name, ssn)을 적어야한다. 왜냐면 컴파일러는 기본적으로 super()만 제공하기 때문이다.
		this.studentNo = studentNo;
	}
}
