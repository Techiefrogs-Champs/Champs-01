package absracts;

abstract  class A{
    A(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void  a_method();
    void method1(){
        System.out.println("This is normal method for abstract class");
    }
}
 class B extends A{
  void a_method(){
      System.out.println("This is abstract method");
  }
}
  class abs4{
   public static void main(String []args){
      B obj=new B();
      obj.method1();
      obj.a_method();
   }
  }
      
  
 


    
