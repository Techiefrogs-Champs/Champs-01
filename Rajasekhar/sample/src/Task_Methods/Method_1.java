
/* Create a class named 'PrintNumber' to print various numbers of different datatypes by 
creating different methods with the same name 'printn' having a parameter for each datatype. */
package src.Task_Methods;

public class Method_1{
	public static void main(String[] args) {
		PrintNumber obj =new PrintNumber();
		obj.printn(123);
		obj.printn(123.0123456987);
		obj.printn(123.0123);
		obj.printn(12345678910L);
	}
}
class PrintNumber{
  public  void printn(int Value){
    System.out.println(Value);
  }
  public  void printn(double Value){
    System.out.println(Value);
  }
  public void printn(float Value){
    System.out.println(Value);
  }
  public void printn(long Value){
    System.out.println(Value);
  }
}