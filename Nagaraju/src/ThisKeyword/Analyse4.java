package ThisKeyword;
/*As argument in a method*/

class Method {
    void method1(Method m1){
        System.out.println("This is method 1");
    }
      void method2(){
        method1(this);
      }
    }
    class Analyse4
    {
      public static void main (String[] args) {
        Method m = new Method();
        m.method2();
      }
    
}


/*Output: This is method 1*/
