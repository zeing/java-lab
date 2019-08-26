import java.util.*;
class No12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		do {
			a = scan.nextInt();
			if(a<0||a>1000)
				System.out.println("Out of range");
		} while(a<0||a>1000);
		int sum=0,newa=a;
		 do {
			sum+=newa%10;
			newa/=10;
		 }while(newa>0);
		System.out.println("sum of "+a+" is "+sum);
	}
 }