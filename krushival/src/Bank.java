abstract class Bank {
    abstract int getbalance();}
    class BankA  extends Bank {
        int deposit = 100;
        int getbalance()
    {
    return deposit;
    }
}
class BankB extends Bank {
    int deposit = 150;
    int getbalance()
    {
    return deposit;
    }
}
class BankC extends Bank {
    int deposit = 200;
    int getbalance()
    {
        return deposit;
    }                          Abstract sample 2
}
class Main {
    public static void main(String args[]){
        BankA a=new BankA();
        System.out.println("Balance in BankA is:" +a.getbalance());
        BankB b=new BankB();
        System.out.println("Balance in BankB is:" +b.getbalance());
        BankC c=new BankC();
        System.out.println("Balance in BankC is:" +c.getbalance());
    }
}
    




    
