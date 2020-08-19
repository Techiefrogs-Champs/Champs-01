package CodesDope;

class Tri
{
    int a,b,c;
    public double area(){
        float s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public float perimeter()
    {
        return a+b+c;
    }

}
public class Exe3 {
    public static void main(String[] args)
    {
        Tri t=new Tri();
        t.a=3;
        t.b=4;
        t.c=5;
        System.out.println(t.area());
        System.out.println(t.perimeter());

    }  
}