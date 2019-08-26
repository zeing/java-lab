class Start { 
	public static int start1(int[] a, int[] b)   {
		int num=0;
		if(a[0]==1) 
			num++;
		if(b[0]==1)
			num++;
		return num;
	}	
}

class TestStart {
	public static void main(String[] args) {
		int[] a = {0,1,5};
		int[] b = {1,3,5};
		System.out.println(Start.start1(a,b)) ;
	}
}
