class MakeLast { 
	public int[] makeLast(int[] a) {
		int[] b= new int[a.length*2] ;
		for(int i=0; i<b.length; i++) {
			if(i==b.length-1)
				b[i] = a[a.length-1];
			else 
				b[i] =0;
		}
		return b;
	}
	
}

class TestMakeLast {
	public static void main(String[] args) {
		int[] a = {4,5};
		MakeLast b = new MakeLast();
		int[] c = b.makeLast(a);
		for(int i = 0; i<c.length; i++) 
				System.out.println(c[i]) ;
	}

}
