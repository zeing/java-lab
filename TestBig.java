class Big { 
	public  int[] biggerTwo(int[] a, int[] b)   {
		if(a[0]+a[1] > b[0] +b[1])
			return a;
		else 
			return b;
	}	
}

class TestBig {
	public static void main(String[] args) {
		int[] a = {2,1};
		int[] b = {1,3};
		Big big = new Big();
		int[] c = big.biggerTwo(a,b);
		for(int i=0; i<a.length; i++)
		System.out.print(c[i]+"  ") ;
	}
}
