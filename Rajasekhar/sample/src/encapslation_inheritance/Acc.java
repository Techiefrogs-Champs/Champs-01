package src.encapslation_inheritance;

class Bank {
    public String Ac_holder_Name;
    public String Acc_type;
    public int D_Amount;
    public int W_Amount;
    
    public Bank() {
        System.out.println("This Techie Bank");
    }
}

class Account extends Bank {
    void Acc_holder_details(String Name, String Acc_Type) {
        Ac_holder_Name = Name;
        Acc_type = Acc_Type;
    }
    public void Deposit(int D_amount){
       D_Amount = D_amount;
    }
    public void Withdraw(int W_amount){
       W_Amount = W_amount;
   
   
    }
}

public class Acc extends Account {
    public static void main(String args[]) {
        Acc A = new Acc();
        A.Acc_holder_details("Rajasekhar","Savings");
        A.Deposit(9999);
        A.Withdraw(5000);
        A.
        System.out.println("Account Holder name: "+A.Ac_holder_Name+" \nAccount Type: "+A.Acc_type);
        System.out.println("Amount to be deposited: "+A.D_Amount);
        System.out.println("Amount to be withdrawal: "+A.W_Amount);
        System.out.println("balance after withdrawal: " + (A.D_Amount-A.W_Amount));

    }
}