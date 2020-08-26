abstract class parent{
    abstract void method1();
    
    static void mymethod(){
         System.out.println("parent");
    }
 }
   class child extends parent{
      static void mymethod(){
          System.out.println("child");
      }
          void method1(){
           System.out.println("method for abstract class");
        }
    } 
    class method4{
        public static void main(String []args){
            parent obj= new child();
            obj.method1();
            parent.mymethod();
            child.mymethod();
        }
    }