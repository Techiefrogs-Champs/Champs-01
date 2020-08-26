class Bank22 {
    int a;
    int b;
    int c;
    int d;
   int getbalance(int a){
       
       System.out.println("bank  balance=" +a);
       return a;
   }
}
   class BankA extends Bank22{
       int getbalance(int b){
           
           System.out.println(" bank a balance=" +b);
           return b;
       }
   }   
   class BankB extends BankA{
      int getbalance(int c){
          
           System.out.println("bank b balance=" +c);
           return c;
       }
   }

   class BankC extends BankB{
   int getbalance( int d){ 
           
           System.out.println("bank c balance=" +d);
       return d;
       }
   }  
    class method6{
       public static void main(String args[]){
           Bank22 obj=new Bank22();
           BankA obj1=new BankA();
           BankB obj2=new BankB();
           BankC obj3=new BankC();
           obj.getbalance(0000);
           obj1.getbalance(1000);
           obj2.getbalance(1500);
           obj3.getbalance(2000);
       }

   }