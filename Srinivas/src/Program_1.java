public class Program_1{
	public static void main(String[] args) {
		PrintNumber obj =new PrintNumber();
		obj.printn(111);
		obj.printn(1253.0126987);
		obj.printn(13.0123);
		obj.printn(1278910L);
	}
}
class PrintNumber{
  public static void printn(int x){
    System.out.println(x);
  }
  public static void printn(double x){
    System.out.println(x);
  }
  public static void printn(float x){
    System.out.println(x);
  }
  public static void printn(long x){
    System.out.println(x);
  }
}