class Parent
{
private void p()
{
System.out.println(" parent class");
}
}
class Child extends Parent
{
void  c()
{
System.out.println("child class");
}
}
class Two
{
public static void main(String args[])
{
Parent pa=new Parent();
Child ch=new Child();
pa.p();
ch.c();
ch.p();
}
}
