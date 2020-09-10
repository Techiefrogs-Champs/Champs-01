package absracts;

 abstract class Bank {
     abstract void getbalance();
    }
    class BankA extends Bank{
        int i;
        BankA(int i){
        this.i=i;
        }
        void getbalance(){
            System.out.println("the bankA balance is =" +i);
    }
}
    class BankB extends Bank{
        int j;
        BankB(int j){
          this.j=j;
        }
        void getbalance(){
            System.out.println("the BankB balance is = " +j);
        }
    }
    class BankC extends Bank{
        int k;
        BankC(int k){
         this.k=k;

        }
        void getbalance(){
            System.out.println("the bankc balance is = " +k);
        }
    }
    class abs2{
        public static void main(String []args){
        BankA obj=new BankA(100);
        BankB obj1=new BankB(150);
        BankC obj2=new BankC(200);
        obj.getbalance();
        obj1.getbalance();
        obj2.getbalance();
    }
} 