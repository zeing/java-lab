class TestMyRectangle2D {
	public static void main(String[] args) {
		MyRectangle2D a = new MyRectangle2D(4,5,10,7);
		MyRectangle2D b = new MyRectangle2D(4,5,2,2);
		System.out.println(a.contains(4,6));
		System.out.println(a.contains(b));
		System.out.println(a.overlaps(b));
		}
}