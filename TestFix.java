class Fix { 
	public int[] Fix3(int[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==3)
				a[i]=0;
		}
		return a;
	}
	
}

class TestFix {
	public static void main(String[] args) {
		int[] a = {1,3,5};
		Fix b = new Fix();
		a = b.Fix3(a);
		for(int i = 0; i<a.length; i++) 
				System.out.println(a[i]) ;
	}

}
