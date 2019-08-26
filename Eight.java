import java.util.* ;
class Eight {
	 public static void main(String[] agrs) {
		 int num , back = 0 , reverse = 0 ; 
		 Scanner scan = new Scanner(System.in) ;
		 
		 do {
		 num = scan.nextInt(); 
		 } while ( num < 100 || num > 999 ) ;
	 
		 do {
		 back=num % 10 ;
		 num/=10 ;
		 reverse = reverse * 10 + back ;  
		 
		 } while( num > 0 ) ;
		 System.out.print(reverse) ;


	}

} 