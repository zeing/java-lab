class Reverse {
	//int[] box = new int[3];
	public int[] reverse3(int[] a) {
		int[] b = new int[a.length];
		int j=0;
		for(int i=a.length-1; i>=0; i--) {
			b[j] = a[i];
			j++;
		}
		return b;
	}
}