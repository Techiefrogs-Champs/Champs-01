import java.util.*;
class Areaa
{
int length;
int breadth;
public Areaa(int l,int b)
{
length=l;
breadth=b;
}
int setDim()
{
return length*breadth;
}
int getArea()
{
return setDim();
}
}
class Six
{
public static void main(String args[])
{
int leng,brea;
Scanner s=new Scanner(System.in);
System.out.println("enter length");
leng=s.nextInt();
System.out.println("enter breadth");
brea=s.nextInt();
Areaa ar =new Areaa(leng,brea);
System.out.println("area is"+ar.getArea());
}
}
