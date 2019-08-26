class Double { 
	public boolean doubles(int[] a) {
		int check =0;
	/*	if(a.length >= 2) 
			if((a[0]==a[1] && a[0]==2) || (a[0]==a[1] && a[0]==3))
				return true;
		
		
		return false;*/
		
	
		if(a.length >= 2) {
			for(int i=0; i<a.length; i++) {
				if(a[i] == 2 )
					check++;
				 else
				  check=0;
			if(check ==2) 
				return true;
			}
			check = 0;
			for(int i=0; i<a.length; i++) {
				if(a[i] == 3 )
					check++;
				 else
				  check=0;
			if(check ==2) 
				return true;
			}
		}
		
		return false;
		
	}
	
}

class TestDouble {
	public static void main(String[] args) {
	int[] a = {3,3};
	Double b = new Double();
	System.out.println(b.doubles(a));
	}

}
