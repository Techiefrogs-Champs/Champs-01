package CodesDope;

class Tria
{
    public double area(int a, int b, int c){
        float s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public float perimeter(int a, int b,int c)
    {
        return a+b+c;
    }

}
public class Exe4 {
    public static void main(String[] args)
    {
        Tria t=new Tria();
        System.out.println(t.area(3,4,5));
        System.out.println(t.perimeter(3,4,5));

    }  
}