/* A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. 
We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. 
Make its three subclasses named 'BankA', 'BankB' and 'BankC' 
with a method with the same name 'getBalance' which returns the amount deposited in that particular bank.
 Call the method 'getBalance' by the object of each of the three banks.
 */ 


package Task_Methods;

public class Method_6{
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