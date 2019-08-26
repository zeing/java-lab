import java.util.* ;
class ten { 
 public static void main (String[] agrs) {
 
Scanner scan = new Scanner(System.in) ;
int sec = scan.nextInt() ;
int day = 0 , min = 0 ;
day = sec /  86400 ;
sec = sec % 86400 ;
/*if ( day != 0 ) 
sec=sec-(day * 86400) ;*/
min = sec / 60 ;
sec = sec %60 ; 
/*
if ( min != 0 ) 
sec=sec-(min * 60) ;*/


System.out.print("day is "+day+"and min is "+min ) ;

}

}