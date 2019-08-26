class Sum {
	public int sum2(int[] a) {
		if(a.length>2) 
			return a[0]+a[1];
		else if(a.length == 1) 
			return a[0];
		else 
			return 0;
		
	}
}