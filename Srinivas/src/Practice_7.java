import java.util.*;
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
    int l,b;
   
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter length: ");
	l=sc.nextInt();
	System.out.print("Enter bredth: ");
    b=sc.nextInt();
        

    Rectangle a = new Rectangle(l,b);
    
    System.out.println("Area of  rectangle is:"+a.Area());
   
}
}