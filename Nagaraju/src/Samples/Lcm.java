public class Lcm {

    public static void main(String[] args) {
   
       int a = 6, b = 24;
       int lcm;
       lcm = (a > b) ? a : b;
       while(true) {
         if( lcm % a == 0 && lcm % b == 0 ) {
           System.out.println("The LCM "+ lcm);
           break;
         }
         ++lcm;
       }
   }
}