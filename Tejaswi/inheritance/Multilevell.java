class Parnt
{
	int a=20;
	void read()
	{
		System.out.println("This is parent"+a);
	}
}
class Child1  extends Parnt
{
	int b=30;
	void show()
	{
		read();
		System.out.println("this is Child1"+b);
	}
}
class Child2 extends Child1
{
	int c=40;
	void display()
	{
		show();
		System.out.println("This is child2:"+c);
	}
}
class Multilevell
{
	public static void main(String[] args) 
	{
		Child2 c2=new Child2();
		c2.display();
	}
}    

