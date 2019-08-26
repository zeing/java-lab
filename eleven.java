import java.util.* ;
class eleven {
	 public static void main(String[] agrs) {
		 Scanner scan = new Scanner(System.in) ;
		 int month = scan.nextInt() ; 
		 double become = 0 ; 
		 for( int i = 0 ; i < month ; i++ ) {
		 become = ( 100 + become ) * ( 1 + 0.00417 ) ;
		 System.out.println("month"+(i+1)+"is"+become) ; 
		 }


	}

} 