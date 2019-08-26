import java.util.* ;
class Six {
 public static void main(String[] agrs) {
 Scanner scan = new Scanner(System.in) ; 
 int a = 23 , b = 16 , c = 27 , max ;
 if ( a > b && a > c ) {
    max = a ;
    }
 else if ( b > a && b > c ) {
    max = b ;
    }
 else {
    max = c ;
    }

  

 System.out.print(max); 
 }
} 