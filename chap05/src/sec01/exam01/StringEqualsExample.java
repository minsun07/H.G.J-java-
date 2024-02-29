package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String v1="안민선";
		String v2 ="안민선";
		
		if(v1==v2) {
			System.out.println("v1과 v2는 참조가 같음");
		}
		else {
			System.out.println("v1과 v2는 참조가 다름");
		}
		System.out.println("---------------------------------------------");
		if(v1.equals(v2)) {
			System.out.println("문자열이 같음");
		}
		System.out.println("---------------------------------------------");
		String v3 = new String("안민선");
		String v4 = new String("안민선");
		
		if(v3==v4) {
			System.out.println("참조가 같음");
		}
		else
			System.out.println("참조가 다름");
		
		System.out.println("---------------------------------------------");
		
		if(v3.equals(v4))
			System.out.println("문자열이 같음");

	}

}
