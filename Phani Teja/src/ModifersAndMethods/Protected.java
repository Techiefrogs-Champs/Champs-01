package ModifersAndMethods;
class D
{  
    protected void msg()
    {
        System.out.println("Protected method");  
    }
}
class Protected extends D{  
    public static void main(String args[]){  
     D obj = new D();  
     obj.msg();  
    }  
}