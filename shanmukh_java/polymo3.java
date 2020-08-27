class overloading
{
    int add(int a, int b)
    {
         return a+b;
    }
    int  add(int a, int b, int c)  
    {
         return a+b+c;
    }
}
public class polymo3
{
   public static void main(String args[])
   {
    overloading obj = new overloading();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
   }
}