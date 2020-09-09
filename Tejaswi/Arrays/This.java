class Number
{
	int x;
	Number()
	{
		this(20);
		this.display();
	}
	Number(int y)
	{
		this.x=y;
	}
	void display()
	{
		System.out.println("x="+x);
	}
}
class This
{
	public static void main(String args[])
	{
		Number t=new Number();
	}
}