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
class B extends A {
int k;
B(int a, int b) 
{
a=b= k;
}
void show()
 {
System.out.println("k: " + k);
}
}
class Eight 
{
public static void main(String args[])
 {
B b = new B(4);
b.show("This is k: ");
b.show();
}
}