package sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String inputDate;
//		
//		while(true) {
//			inputDate = sc.nextLine();
//			System.out.println("입력된 문자열: \"" + inputDate + "\"" );
//			if(inputDate.equals("q")) {
//				break;
//			}
//		}
//		System.out.println("종료");
		
		/*
		 * System.out.println("[필수 정보 입력]");
		 * 
		 * System.out.print("1.이름 : "); String name = sc.nextLine();
		 * 
		 * System.out.print("2.주민번호 앞 6자리: "); int number = sc.nextInt();
		 * 
		 * System.out.printf("3.전화번호: "); int telnum = sc.nextInt();
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("[입력한 내용]"); System.out.println("1.이름: " + name);
		 * System.out.println("2.주민번호 앞 6자리: " + number); System.out.println("3.전화번호: "
		 * + telnum);
		 */
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1+(int)var2+var3 + Double.parseDouble(var4));
		int result2 = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
		System.out.println("result: " + result);
		System.out.println("result2: " + result2);
		
		
	}

}
