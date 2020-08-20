class Onee
{
void test()
{
System.out.println("no arguements");
}
void test(int a)
{
System.out.println("string arguement");
}
void test(int a,int b)
{
System.out.println(a+b);
}
public static void main(String args[])
{
One O=new One();
O.test();
O.test(10);
O.test(2,3);
}
}

