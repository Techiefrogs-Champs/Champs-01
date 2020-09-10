

public class encapsulation1 {
    
    public static void main(String[] args) {

        BankAccount acc=new BankAccount();  
  
        acc.setAcc_no(8004235842L);  
        acc.setName("PRIYA NEKKANTI");   
        acc.setAmount(350000);  
        
    
        System.out.println(acc.getAcc_no()+"  acc_holder:-  "+acc.getName()+"   avl.balance:-   "+acc.getAmount());  
    }  
    }  