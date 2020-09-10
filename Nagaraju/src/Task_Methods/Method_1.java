
/* Create a class named 'PrintNumber' to print various numbers of different datatypes by 
creating different methods with the same name 'printn' having a parameter for each datatype. */
package Task_Methods;

public class Method_1{
	public static void main(String[] args) {
		PrintNumber.printn(123);
		PrintNumber.printn(123.0123456987);
		PrintNumber.printn(123.0123);
		PrintNumber.printn(12345678910L);
	}
}
class PrintNumber{
  public static void printn(int Value){
    System.out.println(Value);
  }
  public static void printn(double Value){
    System.out.println(Value);
  }
  public static void printn(float Value){
    System.out.println(Value);
  }
  public static void printn(long Value){
    System.out.println(Value);
  }
}