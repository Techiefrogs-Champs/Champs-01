package src.Encapsulation;



public class Encapsulation {
    
    private int bankId=2584;
    private String bankname="HDFC";
    private String bankAdress;
    private int bankAcc_no;  

    public int getbankId(){
        return bankId;
    }
    public String getbankname(){
        return bankname;
    }
    public int getbankAcc_no(){
        return bankAcc_no;
    }
    public String getbankAdress(){
        return bankAdress;
    }
    public void setID(int i,String n){    
         this.bankId=i;
         this.bankname=n;      
    }
    public void display()  
    {  
        System.out.println("Roll no.: "+bankId);  
        System.out.println("Student name: "+bankname);  
    } 

    public void setAddres(String A){        
        this.bankAdress=A;     
    }
    public void setBankAcc_no(int I){        
        this.bankAcc_no=I;     
    }
    

    public static void main(String[] main){

        Encapsulation obj=new Encapsulation();

        System.out.println(obj.getbankId());
        System.out.println(obj.getbankname());
        obj.display();
        obj.setAddres("Pallantla");
        System.out.println(obj.getbankAdress());
        obj.setBankAcc_no(123456789);
        System.out.println(obj.getbankAcc_no());
       
       
    }
}