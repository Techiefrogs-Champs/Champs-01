class Fifteen{
    public static void main(String args[])
{
        int arr[]=new int[7];
    try
{
       arr[-5]=8;
    }
    catch(NegativeArraySizeException e)
{
        System.out.println("negative array");
    }
    System.out.println("exception handled");
    }
}