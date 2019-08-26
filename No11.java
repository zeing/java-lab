import java.util.*;
import java.io.*;
class No11 {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n,m,poww,poweing;
      String a="0",b="0";
      String pows="0";
		do {
         try{
   			a = br.readLine(); 
         }catch(Exception e ){ 
            e.printStackTrace(); 
           }    
          n=Integer.parseInt(a);         
          try{
   			b = br.readLine();
         }catch(Exception e ){ 
            e.printStackTrace(); 
           } 
          m=Integer.parseInt(b);
			if((n<0||n>200)||(m<0||m>200))
         System.out.println(n);
         System.out.println(m);
				System.out.println("Out of range");
                         
         
		} while((n<0||n>200)||(m<0||m>200));
     poww=(int)Math.pow(n,m);
     try{
   			pows = br.readLine(poww); 
         }catch(Exception e ){ 
            e.printStackTrace(); 
           }    
           poweing=Integer.parseInt(pows);
   // pows = String.valueOf(poweing);           
		System.out.println(pows) ;
	}
 }