import java.util.*;
class TestReverse {
	public static void main(String[] args) {
	int a[] = {5,11,9};
		Reverse b = new Reverse();
		int[] c=b.reverse3(a);
		for(int i=0; i<3; i++) {
			System.out.print(c[i] +"   ");
		}
	}
}