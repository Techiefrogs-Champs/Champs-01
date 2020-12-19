//Write a program to print the area of a rectangle 
//by creating a class named 'Area' having two methods. 
//First method named as 'setDim' takes length and breadth of rectangle as parameters 
//and the second method named as 'getArea' returns the area of the rectangle. 
//Length and breadth of rectangle are entered through keyboard.
package ClassesObjects;
class Area {
    private double length;
    private double breadth;
    public double getArea (){
        double area = length * breadth;
        return area;
    }
    public void setDim(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
} 
    
class RectArea{
    public static void main(String[] args){
    Area x = new Area();
    x.setDim(4,5);
    System.out.println("Area of Rectangle is:" + x.getArea());
}
}