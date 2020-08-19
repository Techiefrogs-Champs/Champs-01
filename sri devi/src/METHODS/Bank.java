package METHODS;
    

 class amount{ 
  public void getbalance(){ 
   System.out.println();
  }
 }
    class BankA extends amount{ 
       int a=1000;
      public void getBalance( ){  

      System.out.println( "balance in a"+" "+a);

      }

   }
  class BankB extends amount{ 
    int b=1500;
   public void getBalance( ){ 

    System.out.println("balance in b"+" "+b);
   }
  }

  class BankC extends amount{ 
    int c=2000;
   public void getBalance(  ){ 
    System.out.println( "balance in c"+" "+c);

   }


}

public class Bank {
  public static void main(String[] args) {
   BankC obj=new BankC() ;  
   BankB obj1=new BankB();
   BankA obj2=new BankA();
     
    obj.getBalance();
    obj1.getBalance();
    obj2.getBalance();


  }
    






}