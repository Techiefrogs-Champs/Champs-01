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
class method1{
 public static void main(String[] args) {
  PrintNumber number =new PrintNumber(); 
  number.printn(1);
  PrintNumber.printn(19.99d);
  PrintNumber.printn(5.75f);
  PrintNumber.printn(123536737L);
}
} 
 

