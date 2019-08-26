import java.util.*;
class Point {
   private double x;
   private double y;
   
   Point(double x, double y) {
      this.x=x;
      this.y=y;   
   }
   Point() {
      this(0,0); 
   }
   static double distance(Point a, Point b) {
      double d=0;
      double dx=0;
      double dy=0;
      dx=Math.pow((b.x-a.x),2);
      dy=Math.pow((b.y-a.y),2);
      d=Math.pow((dx+dy),0.5);
      return d;

      
   }
   public double getX() {
      return this.x;
   }
   public double getY() {
      return this.y;
   }
   public void setX(double x) {
      this.x=x;
   }
   public void setY(double y) {
      this.y=y;
   }
}
class Testdouble {
   public static void main(String[] arg) {
      Scanner scan = new Scanner(System.in);
      Point a = new Point();
      a.setX(scan.nextInt());
      a.setY(scan.nextInt());
      Point b = new Point();
      b.setX(scan.nextInt());
      b.setY(scan.nextInt());

     
      System.out.println(Point.distance(a,b));
    
      
   }
}