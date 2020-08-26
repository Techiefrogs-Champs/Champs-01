package CodesDope;

class A
{
    int len;
    int b;
    void setDim(int len, int b)
    {
        this.len=len;
        this.b=b;

    }
    public float getArea()
    {
        float area=len*b;
        return area;
    }
}
public class Exe6 {
    public static void main(String[] args){
        A a=new A();
        a.setDim(10,20);
        System.out.println(a.getArea());

    }   
}