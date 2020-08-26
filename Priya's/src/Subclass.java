class Superclass {
    int num = 20;
 
    public void display() {
       System.out.println("This is the display  of superclass");
    }
 }
 
 public class Subclass extends Superclass {
    int num = 10;

    public void display() {
       System.out.println("This is the display  of subclass");
    }
 
    public void my_method() {
       Subclass sub = new Subclass();
 
       sub.display();
       System.out.println("value of the variable  num in sub class:"+ sub.num);
       super.display();
       System.out.println("value of the variable num in super class:"+ super.num);
    }
 
    public static void main(String args[]) {
       Subclass obj = new Subclass();
       obj.my_method();
    }
 }