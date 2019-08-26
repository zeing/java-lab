import java.util.*;
class Domesort  {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int[] A = new int[b];
		for(int i=0; i<b; i++) {
			A[i] = scan.nextInt();
		}
		int temp;
			for (int i = 0; i < b-1; i++) {
				for (int j = 0; j < b-1 - i ; j++) {
					if (A[j] > A[j+1]) {
						 temp  = A[j];
						 A[j]   = A[j+1];
						 A[j+1] = temp;
					}
				 }
			}
		
		for(int i=0; i<b; i++) 
			if(A[i] % 2 == 1) 
				System.out.print(A[i]+"   ");
		for(int i=b-1; i>=0; i--) 
			if(A[i] % 2 == 0) 
				System.out.print(A[i]+"   ");	
	}
}