import java.util.*;
class Sumadd  {
	public static void main(String[] agrs) {
		int sum=0;
		for(int i=1; i<=100;i++) {
			if(i % 2 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}