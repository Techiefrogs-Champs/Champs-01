 class Fourfive
{  
  void m()throws IOException
{  
    throw new IOException(" error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p()
{  
   try
{  
    n();  
 }
catch(Exception e)
{
       System.out.println("exception handled");
 }  
  }  
  public static void main(String args[])
{  
   Fourfive f=new Fourfive();  
   f.p();  
   System.out.println("+ve error");  
  }  
}  