package practices;

    abstract class all{
    abstract void method1();
    
    static void mymethod(){
         System.out.println("parent");
    }
 }
   class ball extends all{
      static void mymethod(){
          System.out.println("child");
      }
          void method1(){
           System.out.println("method for abstract class");
        }
    } 
    class seven{
        public static void main(String []args){
            all obj= new ball();
            obj.method1();
            all.mymethod();
            ball.mymethod();
        }
    }
       

   
   
