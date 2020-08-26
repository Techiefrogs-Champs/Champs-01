package encap;

public class Rabbit11 extends animals{
    String mainSubject = "ANIMAL TYPES";
    public static void main(String args[]){
     Rabbit11 obj = new Rabbit11();
     
     System.out.println(obj.getName());
     System.out.println(obj.getType());
     System.out.println(obj.mainSubject);
     obj.does();
    }
 }