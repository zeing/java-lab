import java.util.*;
class Matrixam  {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		int[][] matrixA = new int [3][3];
		int[][] matrixB = new int [3][3];
		int[][] matrixC = new int [3][3];
		System.out.println("MatrixA");
		for (int i=0; i<3; i++) 
			for(int j=0; j<3; j++) 
				matrixA[i][j] = scan.nextInt();
			
		
		System.out.println("MatrixB");
		for (int i=0; i<3; i++) 
			for(int j=0; j<3; j++) 
				matrixB[i][j] = scan.nextInt();
			
		
		System.out.println("1. + or  2.  - ");
		int b = scan.nextInt();
		if(b == 1) {
			for (int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
				}
			}
		}else if(b == 2 ) {
			for (int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					matrixC[i][j] = matrixA[i][j]-matrixB[i][j];
				}
			}	
		}
		System.out.println("IS");
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matrixC[i][j]+"	");
			}
		System.out.println();
		}
	}
}