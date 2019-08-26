import java.util.Scanner ; 
class solution {
   public static void main(String[] agrs) {
   Scanner add = new Scanner(System.in); 
   int x = add.nextInt();
   double solu ; 
   solu =  3 * Math.pow(x,4.0) + 2 * Math.pow(x,3.0) +  10 - x ;
   System.out.print(solu) ; 
   }
}