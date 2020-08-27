class Thirteen{
    public static void main(String args[])
{
             try
{
       int  i=45/0;
        }
        catch(ArithmeticException e)
{
            System.out.println(e);
        }
        System.out.println("exception handled");
    }
    
}