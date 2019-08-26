import java.util.* ;
public class poppu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		int year,pop,birth,death,imm,yeartosec ; 
		pop = scan.nextInt() ;
		year = scan.nextInt() ;
		yeartosec = year * 365 * 24 * 60 * 60 ;
		birth = yeartosec / 7 ;
		death = yeartosec / 13 ;
		imm = yeartosec / 45 ;
		pop = pop + birth + imm - death ;
		System.out.println(pop) ; 


	}

}