class Square {
	private float sizeX;
	private float sizeY;
	Square() {
		this.sizeX = 0.0f;
		this.sizeY = 0.0f;
	}
	Square(float sizeX, float sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	public void setSizeX(float sizeX){
		this.sizeX = sizeX;
	}
	public void setSizeY(float sizeY){
		this.sizeY = sizeY;
	}

	
	public float getArea() {
		return this.sizeX * this.sizeY;
	}
}