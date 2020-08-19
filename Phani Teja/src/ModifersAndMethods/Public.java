package ModifersAndMethods;
class B
{  
    public int data=10;
    public void msg()
    {
        System.out.println("Public method");  
    }  
}
    public class Public{  
     public static void main(String args[]){  
       B obj=new B(); 
       System.out.println(obj.data);
       obj.msg();
     }  
    }  
