import java.util.*;
class No6 {
	static boolean more14(int[] b, int n) {
		int check=0;
		for(int i=0; i<n; i++) {
			if(b[i]==1)
				check--;
				else if(b[i]==4)
					check++;
		}
		if(check<0)
				return true;
					else 
						return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n;  i++) {
			a[i] = scan.nextInt();
		}
		System.out.println(more14(a, n));
	}
}