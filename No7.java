import java.util.*;
class No7 {
	static void equalData (int a[], int b[]) {
		if(a.length==b.length) {
			int check=0;
			for(int i=0; i<a.length;  i++) 
				for(int j=0; j<a.length; j++) 
					if(a[i]==b[j])    {
						check=1;
						break;
					} else 
						check=0;
			if(check==1)
				System.out.println("equal");
				else
					System.out.println("not equal");
		} else 
			System.out.println("Not equal");
	}
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		int na = scan.nextInt();
		int [] a = new int[na];
		for(int i=0; i<na;  i++) 
			a[i] = scan.nextInt();
		int nb = scan.nextInt();
		int [] b = new int[nb];
		for(int i=0; i<nb;  i++) 
			b[i] = scan.nextInt();
		equalData(a,b);
	}
}