package practices;

 class A {
   int i;
    void printNum(int i){
        System.out.println("the number is=" +i);
   
    }
}
 class B extends A{
    
    int j;
     void printNum(int j){
         
         System.out.println("the sec num is=" +j);
         
         
        }
 }
  class six{
     public static void main(String []args){
         B obj2 = new B();
         obj2.printNum(2);
         obj2.printNum(5);
     }
 }