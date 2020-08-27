import java.util.*;
class Test1 {
int a, b,c;
Test1(int a,int b)
{
a=a;
b=b;
}
void  fun(int a, int b)
{
System.out.println(a+b);
}
Test1(int a,int b,int c)
{
a=a;
b=b;
c=c;
}
void fun2(int a, int b,int c)
{
System.out.println(a+b+c);
}
}
class Constructormethod
{
public static void main(String args[])
{
Test1 t=new Test1(10,20);
Test1 te=new Test1(10,20,30);
t.fun(10,20);
te.fun2(10,20,30);
}
}



