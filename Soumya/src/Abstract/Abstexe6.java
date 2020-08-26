package Abstract;

abstract class Shape {
    abstract int RectangleArea(int length,int breadth);
    abstract int SquareArea(int side);
    abstract double CircleArea(double rad);
}
class Area extends Shape{
    int RectangleArea(int length,int breadth){
        return length*breadth;
    }
    int SquareArea(int side){
        return side*side;

    }
    double CircleArea(double rad){
        return 3.14*rad*rad;
    }

   
}
class Abstexe6{
    public static void main(String[] args) {
        Shape a=new Area();
        int rect=a.RectangleArea(10,20);
        int squa=a.SquareArea(5);
        double cic=a.CircleArea(3);
        System.out.println("Area of rectangle :"+rect);
        System.out.println("Area of Square :"+squa);
        System.out.println("Area of Circle :"+cic);

        
    }
}