class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	
	MyRectangle2D(double x, double y, double width, double height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	MyRectangle2D() {
		this(0,0,1,1);
	}	
	public  void setX(double x) {
		this.x=x;
	}
	public double getX() {
		return this.x;
	}
	public  void setY(double y) {
		this.y=y;
	}
	public double getY() {
		return this.y; 
	}	
	public  void setWidth(double width) {
		this.width=width;
	}
	public double getwidth() {
		return this.width;
	}	
	public  void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public double getArea() {
		return this.width*this.height;
	}
	public double getPerimeter() {
		return 2*this.width+2*this.height;
	}
	public boolean contains(double x, double y) {
		if(this.x-this.width/2<x && this.x+this.width/2>x ) 
			if(this.y-this.height/2<y && this.y+this.height/2>y) 
				return true;
				return false;
	}	
	public boolean contains(MyRectangle2D r) {
		if(this.x-this.width/2 < r.x-r.width/2 &&  this.x+this.width/2 > r.x-r.width /2) 
			if(this.y-this.height/2 < r.y-r.height/2 &&  this.y+this.height/2 > r.y-r.height /2) 
				return true;
				return false;
	}
	public boolean overlaps(MyRectangle2D r) {
		/*if((r.x+r.width/2<=this.x+this.width/2  && r.x+r.width/2>=this.x-this.width/2) || (r.x-r.width/2<=this.x+this.width/2  && r.x-r.width/2>=this.x-this.width/2 )) 
			if((r.y+r.height/2 <= this.y+this.height/2 && r.y+r.height/2 >= this.y-this.height/2) || (r.y-r.height/2 <= this.y+this.height/2 && r.y-r.height/2 >= this.y-this.height/2)  )
				return true;
		else  if(r.x+r.width/2 <= this.x+this.width/2 &&  r.x-r.width/2 >= this.x-this.width/2 ) {
			if(r.y+r.height/2 >= this.y+this.height/2  && r.y-r.height/2 <= this.y+this.height/2)
				return true;
			if(r.y+r.height/2 >= this.y-this.height/2  && r.y-r.height/2 <= this.y-this.height/2)
				return true;
		}*/
	if( this.x-this.width/2 <= r.x-r.width/2 && this.x+this.width/2 >= r.x-r.width/2 ) {
			 if( this.y-this.height/2 <= r.y+r.height/2 && this.y+this.height/2 >= r.y+r.height/2 )
				return true;
			 if( this.y-this.height/2 <= r.y-r.height/2 && this.y+this.height/2 >= r.y-r.height/2 )
				return true;
		}  
     else if( this.x-this.width/2 <= r.x+r.width/2 && this.x+this.width/2 >= r.x+r.width/2 )  {
         if( this.y-this.height/2 <= r.y+r.height/2 && this.y+this.height/2 >= r.y+r.height/2 )
            return true;
         if( this.y-this.height/2 <= r.y-r.height/2 && this.y+this.height/2 >= r.y-r.height/2 )
            return true;
      }
      return false;
   }
	
}