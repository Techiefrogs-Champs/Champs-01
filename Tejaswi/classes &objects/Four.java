class Tri
{
int a,b,c;
double s;
Tri(int a1,int b1,int  c1)
{
a=a1;
b=b1;
c=c1;
}
double area( )
{
s=(a+b+c)/2;
return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
}
int perimeter( )
{
return(a+b+c);
}
}
class Four
{
public static void main(String args[])
{
Tri t1=new Tri(3,4,5);
Tri t2=new Tri(3,4,5);
System.out.println(t1.area());
System.out.println(t2.perimeter());
}
}