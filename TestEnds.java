import java.util.*;
class TestEnds {
	public static void main(String[] args) {
		int a[] = {1};
		Ends d = new Ends();
		int[] c =d.makeEnds(a);
		for(int i=0; i<c.length; i++) 
			System.out.print(c[i]+"  ");
	}
}

class Ends {
	public int[] makeEnds(int[] a) {
		int[] c = new int[2];
		c[0] = a[0];
		c[1] = a[a.length-1];
		return c;
		
	}
}
