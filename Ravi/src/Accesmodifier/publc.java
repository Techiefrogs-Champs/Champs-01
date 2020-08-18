package src.Accesmodifier;

public class publc {

    public int i=10;
    private String name="ravi";
    public int legCount;

    public void M2() {
        System.out.println("ID="+ i + "name is="+name);
    }

    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }

    public int addTwoNumbers(int a, int b){
        return a+b;
       }

   
    public static void main(String args[]) {

        publc obj11=new publc();
        obj11.M2();
        obj11.legCount=5;
        obj11.display();
        System.out.println(obj11.addTwoNumbers(100, 101));
    
     
    } 
   
       
} 


 
