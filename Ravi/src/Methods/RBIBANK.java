
class Customer
{
    String name="Ravi";
    String addres="Pallantla";


}

class Account
{
    int accountid=123456;
    String accountType="Saving";

}

 class RBI {

    Customer C;
    Account A;


     double getRateOfInterest(){
         return 0;
    }
   
    
}

class SBI extends RBI
{
    double getRateOfInterest() {
        return 8.4f;
    }

}
class ICICI extends RBI 
{
    double getRateOfInterest() {
        return 7.3f;
    }
}

class PNB  extends RBI{
    double getRateOfInterest() {
        return 9.7f;
    }
    
}



public class RBIBANK {

    public static void main(String args[]) {
        RBIBANK obj=new RBIBANK();
        RBI b;  
        b=new SBI();  
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
        b=new ICICI();  
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
        b=new PNB();  
        System.out.println("PNB Rate of Interest: "+b.getRateOfInterest());     }
    
}