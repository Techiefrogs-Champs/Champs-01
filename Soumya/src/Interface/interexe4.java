package Interface;

interface StaticValues {
    int value_1 = 123;
    int value_2 = 456;
    int value_3 = 789;
}
class Interexe4 implements StaticValues{
   public static void main(String[] args) {
      // in interfaces we cannot access instance variable
      //StaticValues obj = new StaticValues();
      //System.out.println(obj.value_3); // in interfaces we cannot access instance variable

      //in interfaces we can access static variables only
      System.out.println("value_1: "+value_1 + "\nvalue_2: " + value_2 +"\nvalue_3: "+value_3 ); 
   }
}