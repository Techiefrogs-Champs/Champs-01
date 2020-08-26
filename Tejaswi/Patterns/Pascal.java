class Pascal 
{
  public static void main(String[] args)
{
    for(int i=0;i<6;i++)
    {
        for(int s=0;s<(6-1);s++)
       {
        System.out.print(" ");
       }
        for(int j=0;j<=i;j++)
        {
	int number=1;
	System.out.print(number +" ");
	number=number * (i-j)/(j+1);
    }
System.out.println();
}
}
}
