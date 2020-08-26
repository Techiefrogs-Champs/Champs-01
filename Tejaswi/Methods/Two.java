class A
{
public static void show()
{
System.out.println("parent");
}
}
class B extends A
{
public static void show()
{
System.out.println("child");
}
}
class Two
{
public static void main(String args[])
{
A obj=new A();
obj.show();
}
}
