class RBI{
    double interestrate;
    double withdraw_limit;

     void GetInterestRate(double interestrate) { 
        System.out.println("interest rate is : "+interestrate);
    }
     void GetWithdrawalLimit(double withdraw_limit) { 
        System.out.println("\nwithdrawal limit is : "+withdraw_limit);
    }
}
 class Customer extends RBI{
    String Name;
    String Addr;
    int PH_NUM;
public void customer(String Name, String Addr,int PH_NUM){
    System.out.println("customer name :"+Name+" Address : "+Addr+" contact number "+PH_NUM);
    Account myacc = new Account();
    myacc.account(309,330);
}
}
 class Account{
    int ACC_num;
    int balance;
public void account(int ACC_num,int balance){
    System.out.println("Account Number : "+ACC_num+"Account Balance is : "+balance);
}
}
class SBI extends RBI{
    SBI(){
        System.out.println("SBI Following RBI interest rates");
        System.out.println("SBI Following RBI withdrawal limt");
    }
     void GetInterestRate(double interestrate) { 
        System.out.println("interest rate is : "+interestrate);
    }
     void GetWithdrawalLimit(double withdraw_limit) { 
        System.out.println("\nwithdrawal limit is : "+withdraw_limit);
    }
}
class ICICI extends RBI{
    ICICI(){
        System.out.println("ICICI Following RBI interest rates");
        System.out.println("SBI Following RBI withdrawal limt");
    }
    void GetInterestRate(int interestrate) { 
        System.out.println("interest rate is : "+interestrate);
    }
    void GetWithdrawalLimit(double withdraw_limit) { 
        System.out.println("\nwithdrawal limit is : "+withdraw_limit);
    }
}

public class Program_9 {
    public static void main(String[] args) {
        Customer newcustm = new Customer();
        newcustm.customer("ramu", "Bangalore", 76036);
        SBI sbi = new SBI();
        sbi.GetInterestRate(4);
        sbi.GetWithdrawalLimit(100.456789);
        ICICI icici = new ICICI();
        icici.GetInterestRate(4);
        icici.GetWithdrawalLimit(100.456789);
    }
}
 