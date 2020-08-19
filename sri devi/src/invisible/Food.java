package invisible;

abstract class bank{

abstract void getBalance();


}

class bankA extends bank{

   void getBalance(){
  
  System.out.println("amount is 100");

   }
 }

class bankB extends bank{

    void getBalance(){

  System.out.println( "amount is 150");

    }

}

class bankC extends bank{

    void getBalance(){

System.out.println("amount is 200");

    }

}

public class Food {
       

public static void main(String[] args) {
  bankA obj2=new bankA(); 
  bankC obj =new bankC();
  bankB obj1=new bankB();
   obj.getBalance();
   obj1.getBalance();
   obj2.getBalance();

}


}