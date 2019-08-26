import java.util.* ;
class Saven {
 public static void main(String[] agrs) {
 int[] num = {23 , 58 , 88 , 16 , 27 } ;  
  //System.out.print(num[0]) ;
 int max=0,i=0 ;
 do {
    if ( num[i] > max ) 
    max = num[i] ; 
    i++ ;
    
 }while ( i < 5 )  ;
 System.out.print(max); 
 }
} 