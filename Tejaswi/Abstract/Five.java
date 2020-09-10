abstract class Animal
{
abstract void cats();
abstract void dogs();
}
class Cats extends Animal
{
void cats()
{
System.out.println("cats meow");
}
}
class Dogs extends Animal
{
void dogs()
{
System.out.println("dogs bark");
}
}
class Five
{
public static void mian(String args[])
{
Animal c=new Cats();
Animal d=new Dogs();
c.cats();
d.dogs();
}
}
