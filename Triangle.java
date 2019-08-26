class Triangle {
	// Access_Modifier data_type Name_Attribute;
	private float base;
	private float height;
	Triangle() {
		//this.base = 0.0f;
		//this.height = 0.0f;
		this(0.0f,0.0f);
	}
	Triangle(float base, float height) {
		this.base = base;
		this.height = height;
		
	}
	Triangle(float base) {
		//this.base = base;
		//this.height = base;
		this(base,base);
	}
	public float getBase() {
		return this.base ;
	}
	public float getHeight() {
		return this.height ;
	}
	public void setBase(float base) {
		 this.base = base;
	}
	public void setHeight(float height) {
		 this.height = height;
	}
	public float calculateArea() {
		return 0.5f *  this.base * this.height ;
	}
}

