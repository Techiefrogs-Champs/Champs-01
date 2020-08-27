/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
by creating a class named 'Rectangle with a method named 'Area' which returns the area and length and 
breadth passed as parameters to its constructor*/ 
class Rectangle{
    int length;
    int breadth;

    public Rectangle(int l, int b) {
        length=l;
        breadth=b;
    }
    public int Area(){
        return length*breadth;
    }
}
class Practice_5{
public static void main(String[] args){
    Rectangle a = new Rectangle(4,5);
    Rectangle b = new Rectangle(5,8);
    System.out.println("Area of first rectangle is:"+a.Area());
    System.out.println("Area of second Rectangle  is:"+b.Area());
}
}