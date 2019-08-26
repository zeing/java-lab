import java.util.*;
class Bit  {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		/*double one = scan.nextDouble();
		double two = scan.nextDouble();
		double thi = scan.nextDouble();
		double four = scan.nextDouble();
		double five = scan.nextDouble();*/
		double max = 0;
		int b=0;
		double[] bit = new double[5];
		for(int i=0; i<5; i++) {
			bit[i] = scan.nextDouble();
			if(max < bit[i]) {
				max = bit[i];
				b=i;
			}
		}
		/*for(int i=0; i<5; i++) {
			if(max < bit[i]) {
				max = bit[i];
				b=i;
			}
		}*/
		System.out.println("the winner is "+(b+1)+" in "+max);
	}
}