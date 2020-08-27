class Overload 
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a;
      
    }
}
class polymo1
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        
        Obj .demo(10);
        Obj .demo(10, 20);
        Obj.demo(56.7);
        
    }
}