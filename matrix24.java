import java.util.*;
class matrix24  {
	public static void main(String[] agrs) {
		int[][] matrix = new int[2][4];
		int temp;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 - i ; j++) {
				if (matrix[1][j] > matrix[1][j+1]) {
					for(int k=0; k<2; k++) {
						 temp  = matrix[k][j];
						matrix[k][j]  = matrix[k][j+1];
						matrix[k][j+1] = temp;
					}	
				}
			 }
		}
		System.out.println(" max is "+(matrix[0][0]+matrix[0][1]));
	}
}