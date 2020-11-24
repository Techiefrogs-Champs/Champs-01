class Par
{
	void read()
	{
		System.out.println("This is parent");
	}
}
class Chi1  extends Par
{
	void show()
	{
		System.out.println("this is Child1");
	}
}
class Chi2 extends Chi1
{
	void display()
	{
		System.out.println("This is child2:");
	}
}
class Hierarchical
{
	public static void main(String[] args) 
	{
		Chi2 c2=new Chi2();
        c2.display();
        c2.read();
        c2.show();
	}
}    

