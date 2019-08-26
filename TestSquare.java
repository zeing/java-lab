class TestSquare {
	public static void main(String[] args) {
		//1
		Square squareA = new Square();
		Square squareB = new Square();
		//2
		squareA.setSizeX(2.145f);
		squareA.setSizeY(9.32f);
		//3
		squareB.setSizeX(7.0f);
		squareB.setSizeY(7.0f);
		//4
		System.out.println("Area squareA is : " + squareA.getArea());
		System.out.println("Area squareB is : " + squareB.getArea());
		//5
		squareB = squareA ;
		
		System.out.println("Area squareA is : " + squareA.getArea());
		System.out.println("Area squareB is : " + squareB.getArea());
	}
		
}