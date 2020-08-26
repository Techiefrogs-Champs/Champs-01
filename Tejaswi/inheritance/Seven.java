class Counter
{
int i;
void increament()
{
i=3;
}
class Sub extends Counter
{
void increament()
{
}
}
}
class Seven
{
public static void main(String args[])
{
Sub t1=new Sub();
System.out.println(t1.i);
}
}