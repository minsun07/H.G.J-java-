package sec06;

public class StringConcatExample {

	public static void main(String[] args) {
		
		String str1 = "jdk" + 0.6;
		String str2 = str1 + "특징";
		
		System.out.println(str2);
		
		String str3 = "jdk" + 3 + 3.0;
		String str4 = 3 + 3.0 + "jdk";
		
		System.err.println(str3);
		System.out.println(str4);

	}

}