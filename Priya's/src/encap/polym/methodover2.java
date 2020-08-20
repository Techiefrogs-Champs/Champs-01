package encap.polym;

class Main{
    public void myMethod(){
     System.out.println("Overridden Method");
    }
 }
 public class methodover2 extends Main{
 
    public void myMethod(){
     System.out.println("Overriding Method");
    }
    public static void main(String args[]){
     Main obj = new methodover2();
     obj.myMethod();
    }
 }