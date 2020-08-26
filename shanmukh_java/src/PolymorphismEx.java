class bankAcno{  
    void number(){System.out.println("Account NUmber 234502906");}  
    }  
    class panNum extends bankAcno{  
    void number(){System.out.println("Pan Number Apnmuk123");}  
    }  
    class adharNUm extends bankAcno{  
    void number(){System.out.println("Aadhar Number 12334614141");}  
    }  
    
    class PolymorphismEX{  
    public static void main(String[] args){  
        bankAcno a= new bankAcno();
        a.number();  
    a=new panNum();  
    a.number();  
    a=new adharNUm();  
    a.number();  
    
    }}  