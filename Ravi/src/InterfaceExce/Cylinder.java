package src.InterfaceExce;

public class Cylinder extends Circle{
    private double height;

   public Cylinder() {
      super();  
      this.height = 1.0;
      System.out.println("Constructed a Cylinder with Cylinder()");  
   }
   public Cylinder(double height) {
      super();  
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height)");  
   }
   public Cylinder(double height, double radius) {
      super(radius);  
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  
   }
   public Cylinder(double height, double radius, String color) {
      super(radius, color); 
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  
   }

 
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   
   public double getVolume() {
      return getArea()*height;   
   }

   
   public String toString() {
      return "This is a Cylinder";  
   }
   public static void main(String[] args) {
    Cylinder cy1 = new Cylinder();
    System.out.println("Radius is " + cy1.getRadius()
       + ", Height is " + cy1.getHeight()
       + ", Color is " + cy1.getColor()
       + ", Base area is " + cy1.getArea()
       + ", Volume is " + cy1.getVolume());
  

    Cylinder cy2 = new Cylinder(5.0, 4.0);
   
    System.out.println("Radius is " + cy2.getRadius()
       + ", Height is " + cy2.getHeight()
       + ", Color is " + cy2.getColor()
       + ", Base area is " + cy2.getArea()
       + ", Volume is " + cy2.getVolume());
    }
    
}