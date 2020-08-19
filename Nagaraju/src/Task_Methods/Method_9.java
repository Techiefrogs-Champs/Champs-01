/* All the banks operating in India are controlled by RBI.RBI has set a well defined guideline 
 (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) 
 which all banks must follow.
  For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; 
  however, banks are free to use 4% interest rate or to set any rates above it. 

 Write a JAVA program to implement bank functionality in the above scenario and
 demonstrate the dynamic polymorphism concept. Note: Create few classes namely Customer, Account, RBI 
 (Base Class) and few derived classes (SBI, ICICI, PNB etc). 
 Assume and implement required member variables and functions in each class. */

package Task_Methods;

class RBI{
    double interestrate;
    double withdraw_limit;

     void getInterestRate(double interestrate) { 
        System.out.println("interest rate is : "+interestrate);
    }
     void getWithdrawalLimit(double withdraw_limit) { 
        System.out.println("\nwithdrawal limit is : "+withdraw_limit);
    }
}
class SBI extends RBI{
    SBI(){
        System.out.println("SBI Following RBI interest rates");
        System.out.println("SBI Following RBI withdrawal limt");
    }
     void getInterestRate(double interestrate) { 
        System.out.println("interest rate is : "+interestrate);
    }
     void getWithdrawalLimit(double withdraw_limit) { 
        System.out.println("\nwithdrawal limit is : "+withdraw_limit);
    }
}
class ICICI extends RBI{
    ICICI(){
        System.out.println("ICICI Following RBI interest rates");
        System.out.println("SBI Following RBI withdrawal limt");
    }
    void getInterestRate(int interestrate) { 
        System.out.println("interest rate is : "+interestrate);
    }
    void getWithdrawalLimit(double withdraw_limit) { 
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
public class Method_9 {
    public static void main(String[] args) {
        Customer newcustm = new Customer();
        newcustm.customer("Nagaraju", "Bangalore", 60316);
        SBI sbi = new SBI();
        sbi.getInterestRate(4);
        sbi.getWithdrawalLimit(100.456789);
        ICICI icici = new ICICI();
        icici.getInterestRate(4);
        icici.getWithdrawalLimit(100.456789);
    }
}