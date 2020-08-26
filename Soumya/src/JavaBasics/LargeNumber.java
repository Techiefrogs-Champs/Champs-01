package JavaBasics;

public class LargeNumber {
  // static int n1,n2,n3;
  static int  n1=100;
  static int  n2=20;
  static int n3=5;
   public static void main(String[] args) {
       if(n1>n2&&n1>n3){
           System.out.println("n1 is largest number");
       }
       else if(n2>n1&&n2>n3){
           System.out.println("n2 is the largest number");
       }
       else{
           System.out.println("n3 is the largest number");
       }
   }
}