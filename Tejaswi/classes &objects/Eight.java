import java.util.*;
class Eight
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a1");
int a1=sc.nextInt();
System.out.println("enter b1");
int b1=sc.nextInt();
System.out.println("enter c1");
int c1=sc.nextInt();
Average avg=new Average(a1,b1,c1);
System.out.println("average is "+avg.calculate(a1,b1,c1));
}
}
class Average
{
int a,b,c;
public Average(int aa,int bb,int cc)
{
aa=a;
bb=b;
cc=c;
}
int calculate(int a,int b,int c)
{
return (a+b+c)/3;
}
}

