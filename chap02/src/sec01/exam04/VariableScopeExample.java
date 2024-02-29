package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;  //v2는 if문 안에서만 사용할 수 있기 때문인다.

	}

}
