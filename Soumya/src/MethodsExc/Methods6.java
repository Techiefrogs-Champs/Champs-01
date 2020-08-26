package MethodsExc;

 class Bank {
    void get_balance(){}
}
class BankA extends Bank{
    public void get_balance(){
        System.out.println("Amount in bankA :$1000");
    }

}
class BankB extends Bank{
    public void get_balance(){
        System.out.println("Amount in bankB :$1500");
    }
}
class BankC extends Bank{
    public void get_balance(){
        System.out.println("Amount in bankC :$2000");
    }
}
class Methods6{
    public static void main(String[] args) {
        Bank b=new BankA();
        Bank c=new BankB();
        Bank d=new BankC();
        b.get_balance();
        c.get_balance();
        d.get_balance();

    }
}