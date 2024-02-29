package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int score[] = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score1: score) {
			sum += score1;
		}
		System.out.println("총합 : " +sum);
		
		double avg = (double)sum/score.length;
		System.out.println("평균 : " + avg);

	}

}
