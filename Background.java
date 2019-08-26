class Background {
	private int id;
	private String name;
	private int numBuilding;
	
	Background() {
	}
	Background(int id, String name, int numBuilding) {
		 this.id=id;
		 this.name=name;
		 this.numBuilding=numBuilding;
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
	public  void setNumbuilding(int numBuilding) {
		this.numBuilding=numBuilding;
	}
	public  int getNumBuilding() {
		return this.numBuilding;
	}
	public void paintBg() {
		System.out.println("Now painting Background");
	}
	public void showBgDetails() {
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("NUM BUILDING : "+numBuilding);
	}


	
}