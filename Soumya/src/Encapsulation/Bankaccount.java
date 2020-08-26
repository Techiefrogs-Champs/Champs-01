package Encapsulation;

 public class Bankaccount {
     private int accno;
     private String name;
     private String email;
     private float balance;
     public int getAccno(){
         return accno;
     }
     public void setAccno(int accno){
         this.accno=accno;
     }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name=name;
     }
     public String getEmail(){
         return email;
     }
     public void setEmail(String email){
         this.email=email;
     }
     public float getBalance(){
         return balance;
     }
     public void setBalance(float balance){
         this.balance=balance;
     }
     public void display(){
         System.out.println("Account number :"+accno);
         System.out.println("Name of the account holder :"+name);
         System.out.println("E-mail adress of the account holder :"+email);
         System.out.println("Balance :"+balance);
     }
     



     

    
}