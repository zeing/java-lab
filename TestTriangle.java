class TestTriangle {
	public static void main(String[] args) {
		//Class_Name Object_Name = new Class_Name();
		//Triangle triangleA = new Triangle(20.0f,30.0f);
		Triangle triangleA = new Triangle();
		Triangle triangleB = new Triangle();
		Triangle triangleC = new Triangle(4);
		//triangleA.base = 20.0f;
		//triangleA.height = 30.0f;
		//System.out.println(triangleA.getBase() + "\n" + triangleA.getHeight());
		//triangleA.setBase(40.0f);
		//triangleA.setHeight(50.0f);
		System.out.println(triangleA.getBase() + "\n" + triangleA.getHeight());
		System.out.println(triangleA.calculateArea());	
	}
}

