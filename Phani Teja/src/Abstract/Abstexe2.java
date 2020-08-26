package Abstract;

abstract class Bank {
    abstract void getBalance();
}
class Bank1 extends Bank{
    void getBalance() {
        System.out.println("Amount Deposited :$100");
    }
}
class Bank2 extends Bank{
    void getBalance(){
        System.out.println("Amount Deposited :$150");
    }
}
class Bank3 extends Bank{
    void getBalance(){
        System.out.println("Amount Deposited :$200");
    }
}
class Abstexe2{
    public static void main(String[] args) {
        Bank a=new Bank1();
        Bank b=new Bank2();
        Bank c=new Bank3();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}