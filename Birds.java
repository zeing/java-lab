class Birds {
	int id;
	String name;
	String color;
	int birdSize;
	String type;
	int power;
	Birds() {
	}
	Birds(int id, String name, String color, int birdSize, String type,int power) {
		this.id=id;
		this.name=name;
		this.color=color;
		this.birdSize=birdSize;
		this.type=type;
		this.power=power;
	}
	public  void setId(int id) {
		this.id=id;
	}
	public  int getId() {
		return this.id;
	}
	public  void setName(String name) {
		this.name=name;
	}
	public  String getName() {
		return this.name;
	}
	public  void setColor(String color) {
		this.color=color;
	}
	public  String getColor() {
		return this.color;
	}
	public  void setBirdSize(int birdSize) {
		this.birdSize=birdSize;
	}
	public  int getBirdSize() {
		return this.birdSize;
	}
	public  void setType(String type) {
		this.type=type;
	}
	public  String getType() {
		return this.type;
	}
	public void bomb() {
		System.out.println("Bomb!");
	}
	public void showBirdDetails() {
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("COLOR : "+color);
		System.out.println("BIRD SIZE : "+birdSize);
		System.out.println("TYPE : "+type);
		System.out.println("POWER : "+power);
	}


	
}