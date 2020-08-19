package Encapsulation;
 

public class Bankdriver {

    public static void main(String[] args) {
     
        Bank obj=new Bank();
        obj.setNum( 12345);
        obj.setAddress("duddukuru");
        obj.setName("andhra");
       System.out.println ("account number is"+" "+obj.getNum());
        System.out.println("branch  is "+"  "+obj.getAddress());
        System.out.println("bank name is"+"   "+obj.getName());
    
    }
}