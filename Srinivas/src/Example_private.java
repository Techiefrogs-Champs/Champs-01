class Simple{  
    private int data=60;  
    public void msg()
    {
      System.out.println("Hello java");
    }  
    }  
      
public class Example_private{  
     public static void main(String args[]){  
     Simple   obj=new Simple();  
       System.out.println(obj.data);//Compile Time Error  
       obj.msg();//Compile Time Error  
     }  
 }  