 class Fourteen
{
    public static void main(String args[])
{
        int a[]=new int[7];
     try 
        {
         a[10]=8;
        }
     catch (ArrayIndexOutOfBoundsException e) {
         System.out.println(e);
        
        }
      System.out.println("exception handled");
     
    }
}