package src.AbstractExce;

abstract class Bank1{

    abstract int getBalance();
}
class BankA extends Bank1{
    int deposit=100;
    int getBalance(){
        return deposit;
    }
}
class BankB extends Bank1{
    int deposit=150;
    int getBalance(){
        return deposit;
    }
}
class BankC extends Bank1{
    int deposit=200;
    int getBalance(){
        return deposit;
    }
}
public class Bank {
    public static void main(String args[])
        {
        
        BankA a=new BankA();
        System.out.println("Bank A: "+a.getBalance());
        
        
        BankB b=new BankB();
        System.out.println("Bank B: "+b.getBalance());
        
        
        BankC c=new BankC();
        System.out.println("Bank C: "+c.getBalance());
        
        }
}