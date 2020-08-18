package src.ClassObjects;

public class Triangle1 {

    int length;
    int breadth;
    public Triangle1(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

    public static void main(String args[]) {
        Triangle1 obj1=new Triangle1(4,5);
        Triangle1 obj2=new Triangle1(5,8);
        System.out.println("Area :"+ obj1.area()+" "+"perimeter is:"+obj1.perimeter());
        System.out.println("Area :"+ obj2.area()+" "+"perimeter is:"+obj2.perimeter());

    }
    
}