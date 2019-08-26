import java.util.*;
class TestMid {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		Mid d = new Mid();
		int[] c =d.middleWay(a,b);
		for(int i=0; i<c.length; i++) 
			System.out.print(c[i]+"  ");
	}
}