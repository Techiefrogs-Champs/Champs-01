package CodesDope;

class Rectangle 
{
    int length;
    int breadth;
public int Rectangle(int l,int b)
{
    length=l;
    breadth=b;
    return l*b;
}
}
class CodesDope5{
public static void main(String[] args) {
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle();
    r1.Rectangle(4, 5);
    r2.Rectangle(5,8);
    System.out.println("Area of rectangle :"+r1.Rectangle(4,5));
    System.out.println("Area of rectangle :"+r2.Rectangle(5, 8));
}
}
