class No23 { 
	public boolean no23(int[] a) {
		for(int i=0; i<a.length; i++) 
			if(a[i] == 2 && a[i]==3 )
				return false;
		return true;
	
	}
	
}

class TestNo23 {
	public static void main(String[] args) {
	int[] a = {4,5};
	No23 b = new No23();
	System.out.println(b.no23(a)) ;
	}

}
