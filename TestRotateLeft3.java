import java.util.*;
class TestRotateLeft3 {
	public static void main(String[] args) {
	int a[] = {1,2,3};
		RotateLeft3 b = new RotateLeft3();
		b.rotate(a);
		for(int i=0; i<3; i++) {
			System.out.print(a[i] +"   ");
		}
	}
}