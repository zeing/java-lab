import java.util.*;
class Summax  {
	public static void main(String[] agrs) {
		int[] num ={25,2,8,16,35,4};
		int temp;	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i ; j++) {
				if (num[j] > num[j+1]) {
					 temp  = num[j];
					 num[j]   = num[j+1];
					 num[j+1] = temp;
				}
			 }
		}
		
		System.out.println("Sum Max : "+(num[5]+num[4]));
		System.out.println("Sum Min : "+(num[0]+num[1]));
	}
}