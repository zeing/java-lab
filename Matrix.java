import java.util.*;
class Matrix { 
	private int[][] num;
	private int sizeX;
	private int sizeY;
	
	Matrix(int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	void setSizeX(int sizeX ) {
		this.sizeX = sizeX;
	}
	void setSizeY(int sizeY ) {
		this.sizeY = sizeY;
	}
	public void setMatrix() {
	
	}
	public void printMatrix() {
	
	}
	public void multiplyMatrix(Matrix matrixA, Matrix matrixB) {
		if(matrixA.sizeY == matrixB.sizeX) {
			int ans[][] = new int[matrixA.sizeX][matrixB.sizeY];
			int sum = 0 ;
			for (int c = 0; c < matrixA.sizeX; c++ ) {
				for (int d = 0; d < matrixB.sizeY; d++ ) {
					for (int k = 0; k < matrixB.sizeX ; k++ ) {
						sum = sum + matrixA.num[c][k] * matrixB.num[k][d];
					}
					ans[c][d] = sum;
					sum = 0;
				}
			}
			System.out.println("\n****** MatrixA multiply matrixB ******");
			for (int i = 0; i < matrixA.sizeX; i++) {
				System.out.print(" |");
				for (int j = 0; j < matrixA.sizeY; j++ ) {
						System.out.printf("%3d", ans[i][j]);
				}
				System.out.print(" |\n");
			}
		} else {
			System.out.println("Error MatrixA MatrixB size invalid for multiply");
			}
		
	}
}