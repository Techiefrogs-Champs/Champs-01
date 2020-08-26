abstract class Ab
{
Ab()
{
System.out.println("this is constructor of abstract class");
}
abstract void a_method();
{
void b_method()
{
System.out.println("this is non abstract class");
}
}
}
class Sub1 extends Ab
{
void a_method()
{
System.out.println("thisis abstract method");
}
}
class Four
{
public static void main(String args[])
{
Sub1 s=new Sub1();
s.a_method();
s.b_method();
}
}