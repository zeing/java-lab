class RotateLeft3 {
	//int[] box = new int[3];
	public void rotate(int[] a) {
		int temp=a[0];
		for(int i=0; i<a.length; i++) {
			if(i==2)
				a[i]=temp;
			else
				a[i]=a[i+1];
		}
	}
}