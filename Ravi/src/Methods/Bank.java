


class Bank1{
    
    public int getBalance(){
        return 0;
    }
}
class BankA extends Bank1{
    int amount;
    public BankA(int a){
        this.amount=a;
    }
    public int getBalance(){
        return amount;
    }
}
class BankB extends Bank1{
    int amount;
    public BankB(int a){
        this.amount=a;
    }
    public int getBalance(){
        return amount;
    }
}
class BankC extends Bank1{
    int amount;
    public BankC(int a){
        this.amount=a;
    }
    public int getBalance(){
        return amount;
    }
}
public class Bank {
    public static void main(String args[]) {
        BankA obj1=new BankA(1000);
        BankB obj2=new BankB(1500);
        BankC obj3=new BankC(2000);
        System.out.println("Bank A is Balance :"+" "+obj1.getBalance());
        System.out.println("Bank B is Balance :"+" "+obj2.getBalance());
        System.out.println("Bank C is Balance :"+" "+obj3.getBalance());
    }

    
}