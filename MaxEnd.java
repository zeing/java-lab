class MaxEnd {
	public void MaxEnd3(int[] a) {
		if(a[0]>a[a.length-1]) {
			for(int i=0 ; i<a.length; i++) {
				a[i] = a[0];
			}	
		} else {
			for(int i=0 ; i<a.length; i++) {
				a[i] = a[a.length-1];
			}	
		}	
	}
}