class A 
{
int i, j;
A(int a, int b) 
{
i = a; 
j = b;
}
void show()
 {
System.out.println("i and j: " + i + " " + j);
}
}
class B extends A 
{
int k;
B() 
{
void show(int k)
 {
System.out.println("k: " + k);
}
}
}
class Eight 
{
public static void main(String args[])
 {
B b = new B();
b.show(8);
}
}