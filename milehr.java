import java.util.* ;
public class milehr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float run,hr,min,sec,kmhr=0 ;
		run = scan.nextFloat() ;
		hr = scan.nextFloat() ;
		min = scan.nextFloat() ;
		sec = scan.nextFloat() ;
		kmhr=(float) ((run*1.6)/(hr+min/60+sec/3600));
		System.out.println("avg is "+kmhr);

	}

}