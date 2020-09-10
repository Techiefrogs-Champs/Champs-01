class Twentythree
 {
    public static void main(String args[])
{
        int i=10;
        int j=20;
        int k=i+j;
        int a[]=new int[6];
    try{
        k=i+j;
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    try{
        a[22]=20;
    }
    catch( ArrayIndexOutOfBoundsException e)
{
        System.out.println(e);
    }
    finally
{
      System.out.println("the value is " +k);
    }
 }
}
    