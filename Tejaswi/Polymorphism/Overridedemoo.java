class Superdemo
{
void display()
{
System.out.println("this is a superclass");
}
}
class subclass extends Superdemo
{
void display()
{
System.out.println("this is a subclass");
}
}
class Overridedemoo
{
public static void main(String args[])
{
Superdemo  de=new subclass();
de.display();
}
}