class OverloadDemoo1
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
System.out.println("two arguements"+a+"  "+b);
}
public static void main(String args[])
{
OverloadDemoo1 O=new OverloadDemoo1();
O.test();
O.test(10);
O.test(2,3);
}
}

