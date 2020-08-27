class Twentyfour
{
    public static void main(String args[])
{  
        try
{  
          try
{  
           System.out.println(" divide");  
           int b =45/0;  
          }
catch(ArithmeticException e)
{
              System.out.println(e);
           }  
          try{  
          int a[]=new int[15];  
          a[15]=14;  
          }
catch(ArrayIndexOutOfBoundsException e)
{
              System.out.println(e);
           }  
              System.out.println("other statement");  
        }
        catch(Exception e)
{
            System.out.println("handeled");
           }  
           finally
{
               System.out.println("finally excecuted");
           }  
       }  
   
}
    
