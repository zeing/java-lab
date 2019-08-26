class MakeMid { 
	public static int[] makeMiddle(int[] a)   {
		int b[] = new int[2];
		int mid= a.length/2-1;
		for(int i=0;i<b.length; i++) 
			b[i]=a[mid++];
		
		return b;
	}	
}

class TestMakeMid {
	public static void main(String[] args) {
		int[] a = {0,2,5,5};
		MakeMid mid = new MakeMid();
		int[] b= mid.makeMiddle(a);
		for(int i=0; i<b.length; i++) 
		System.out.print(b[i]+"  ") ;
	}
}
