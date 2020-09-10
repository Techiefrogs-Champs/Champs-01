/* Q-4).Prove that the fields in an interface are implicitly static and final. */

package Interfaces;

interface Static_Final_variables_1 {
    int value_1 = 999;
    int value_2 = 888;
   int value_3 = 777;
}
class Static_Final_variables implements Static_Final_variables_1{
   public static void main(String[] args) {
      // in interfaces we cannot access instance variable
      //Static_Final_variables_1 obj = new Static_Final_variables_1();
      //System.out.println(obj.value_3); // in interfaces we cannot access instance variable

      //in interfaces we can access static variables only
      System.out.println("value_1: "+value_1 + "\nvalue_2: " + value_2 +"\nvalue_3: "+value_3 ); 
   }
}