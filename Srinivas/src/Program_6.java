class Bank{
    
    public int getBalance(){
        return 0;
    }
}
class BankA{
    private int Amount;
    public int getBalance() {
        return Amount;
    }
    public void setBalance(int amount) {
        Amount = amount;
    }
}

class BankB{
    private int D_Amount;
    public int getBalance() {
        return D_Amount;
    }
    public void setBalance(int amount) {
        D_Amount = amount;
    }

}
class BankC{
    private int D_mount;
    public int getBalance() {
        return D_mount;
    }
    public void setBalance(int amount) {
        D_mount = amount;
    }

} 
public class Program_6{
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.getBalance();
        BankA obj1 = new BankA();
        obj1.setBalance(1000); 
        System.out.println("you have deposited of in BankA $ "+obj1.getBalance());
        BankB obj2 = new BankB();
        obj2.setBalance(1500); 
        System.out.println("you have deposited of in BankB $ "+obj2.getBalance());
        BankC obj3 = new BankC();
        obj3.setBalance(2000); 
        System.out.println("you have deposited of in BankC $ "+obj3.getBalance());
    }
}
