package practices;

public class three {
    void area(int l,int w )
    {
        int a;
        a=l*w;
       System.out.println("the area of the rectangle =" +a);

    }
    void area(int s)
    {
        int A;
        A=s*2;
        System.out.println("the area of the square =" +A);
    }
    public static void main(String []args){
        three obj=new three();
        obj.area(5,6);
        obj.area(7);
    }
}