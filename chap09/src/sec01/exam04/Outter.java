package sec01.exam04;

public class Outter {

	public void method1(int arg) {
		int localVariable = 1;
		
		//arg = 100; final특성때문에 값을 바꿀 수 없다.
		//localVariable = 100;
		
		class Inner{  //로컬 클래스
			void ethod() {
				int result = arg + localVariable;
			}
		}
	}
}
