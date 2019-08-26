import java.util.*;
class TestHas {
	public static void main(String[] args) {
		int a[] = {1,5};
		Has d = new Has();
		System.out.print(d.has23(a));
	}
}

class Has {
	public boolean has23(int[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == 2 || a[i] == 3) 
				return true;
		}	
		return false;
		
	}
}
