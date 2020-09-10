/* In this exercise, Shape shall be defined as an abstract class, which contains:
•	Two protected instance variables color(String) and filled(boolean). The protected variables 
can be accessed by its subclasses and classes in the same package. They are denoted with a '#' 
sign in the class diagram.
•	Getter and setter for all the instance variables, and toString().
•	Two abstract methods getArea() and getPerimeter() (shown in italics in the class diagram).
The subclasses Circle and Rectangle shall override the abstract methods getArea() and getPerimeter() and
 provide the proper implementation. They also override the toString().
Write a test class to test these statements involving polymorphism
 */

package src.Abstraction;

abstract class Shape_1{
    protected String color;
    protected boolean filled;
    abstract String setcolor();
    abstract boolean setfilled();
    abstract double calcArea();
    abstract double calcPerimeter();
}
class Circle_1 extends Shape_1{
    private double radius;
    String setcolor(){
        return color="Blue";
    }
    boolean setfilled(){
        return filled = true;
    }
  public Circle_1(double radius){
    setRadius(radius);
}
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcArea(){
        double Area=3.142*radius*radius;
        return Area;
    }
    public double calcPerimeter(){
        double CircumArea=2*3.142*radius;
return CircumArea;
    }
    public String toString(){
        return "Area of Circle is ="+calcArea()+"\nCircumference of a circle: "+calcPerimeter();
    }   
}
class Rectangle extends Shape_1 {
    private double length;
    private double breadth;
    String setcolor(){
        return color="Red";
    }
    boolean setfilled(){
        return filled = true;
    }
    public double getlength() {
return length;
    }
    public double getbreadth() {
        return breadth;
    }
    public void setlength(double length) {
        this.length = length;
    }
    public void setbreadth(double breadth) {
        this.breadth = breadth;
    }
    public Rectangle(double length,double breadth){
        setlength(length);
        setbreadth(breadth);
    }
    public double calcArea(){
        double Area=(length * breadth);
return Area;
    }
    public double calcPerimeter(){
        double CircumArea=2*(length+breadth);
        return CircumArea;
    }
    public String toString(){
        return "area of Rectangle:"+calcArea()+"\nPerimeter of a REctangle:"+calcPerimeter();
    }
}
class Square extends Rectangle {
    private double length;
    String setcolor(){
        return color="Green";
    }
    boolean setfilled(){
        return filled = true;
    }
    public double getlength() {
return length;
    }
    public void setlength(double length) {
        this.length = length;
    }
    public Square(double length,double breadth){
        super( length,breadth);
        setlength(length);
        
    }
    public double calcArea(){
        double Area=(length * length);
return Area;
    }
    public double calcPerimeter(){
        double CircumArea=4*length;
        return CircumArea;
    }
    public String toString(){
        return "area of square:"+calcArea()+"\nPerimeter of a square:"+calcPerimeter();
    }
}
public class Abstract_7 {
    public static void main(String []args){
    Circle_1 circle1 = new Circle_1(3);
    System.out.println(circle1);
    System.out.println("color : "+circle1.setcolor());
    System.out.println("filled : "+circle1.setfilled());
    Rectangle r1 = new Rectangle(3,4);
    System.out.println(r1);
    System.out.println("color : "+r1.setcolor());
    System.out.println("filled : "+r1.setfilled());
    Square s1 = new Square(3,4);
    System.out.println(s1);
    System.out.println("color : "+s1.setcolor());
    System.out.println("filled : "+s1.setfilled());
}
}
