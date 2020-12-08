// creating a parent class
class ABC{
   public void myMethod(){
	System.out.println(" Method that is overridden");
   }
}
//creating a child class
public class XYZ extends ABC{

   public void myMethod(){ //defining the same method as of parent class
	System.out.println("Overriding Method");
   }
   public static void main(String args[]){
	ABC obj = new ABC(); // creating the object
	obj.myMethod(); // calling the method
   }
}