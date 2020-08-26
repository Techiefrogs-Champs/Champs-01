package ModifersAndMethods;
class C
{  
    int data=10;
    void msg()
    {
        System.out.println("Default method");  
    }  
}
     class Default{  
     public static void main(String args[]){  
       C obj=new C(); 
       System.out.println(obj.data);
       obj.msg();
     }  
    }   