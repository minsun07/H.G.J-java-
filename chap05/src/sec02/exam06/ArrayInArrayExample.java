package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j +"]=" + mathScores[i][j]);
			}
		}
		System.out.println();
		
		int englishscores[][]= new int[2][];
		englishscores[0] = new int[2];
		englishscores[1] = new int[3];
		for(int i=0; i<englishscores.length; i++) {
			for(int j=0; j<englishscores[i].length; j++) {
				System.out.println("englishscores[" + i + "][" + j +"]=" + englishscores[i][j]);
			}
		}
		System.out.println();
		
		int javascores[][]= {{95,80}, {92,96, 80}};
		for(int i=0; i<javascores.length; i++) {
			for(int j=0; j<javascores[i].length; j++) {
				System.out.println("javascores[" + i + "][" + j +"]=" + javascores[i][j]);
			}
		}
		

	}

}
