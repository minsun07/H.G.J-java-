package sec02.exam11;

public class star {

	public static void main(String[] args) {
		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");				
//			}
//			System.out.println();
//		}
		
		for(int k=1; k<=4; k++) {
			for(int y=4; y>k; y--) {
				System.out.print(" ");
			}
			for(int s=1; s<=k; s++) {
				System.out.print("*");
			}
		System.out.println();
		}			
		

	}

}
