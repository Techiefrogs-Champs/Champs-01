class Triangle
{
int a,b,c;
double s;
double area()
{
s=(a+b+c)/2;
return Math.sqrt( (s*(s-a)*(s-b)*(s-c)));
}
int perimeter()
{
return(a+b+c);
}
}
class Three
{
public static void main(String args[])
{
Triangle t1=new Triangle();
t1.a=3;
t1.b=4;
t1.c=5;
System.out.println(t1.area());
System.out.println(t1.perimeter());
}
}
