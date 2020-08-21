import java.util.*;
class Test1 {
Test1(int a,int b)
{
System.out.println(a+b);
}
Test1(int a,int b,int c)
{
System.out.println(a+b+c);
}
}
class Constructors
{
public static void main(String args[])
{
Test1 t=new Test1(10,20);
Test1 te=new Test1(10,20,30);
}
}



