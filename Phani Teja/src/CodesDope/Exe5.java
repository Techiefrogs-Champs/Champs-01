package CodesDope;

class Rect
{
    public int area(int l,int b)
    {
        return l*b;
    }

}
public class Exe5 {
    public static void main(String[] args)
    {
        Rect r1=new Rect();
        Rect r2=new Rect();
        System.out.println(r1.area(4,5));
        System.out.println(r2.area(5,8));
    }
}