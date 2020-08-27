 class Twenty
{
public static void main(String []args)
{
        String s="teja";
        try
{
        int i=Integer.parseInt(s);
         }
         catch(NumberFormatException e)
{
          System.out.println(e);
    }
    System.out.println("number format exception");
    }
}