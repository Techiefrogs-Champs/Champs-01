package ThisKeyword;

class Method8{
    void method1(){
      System.out.println("This is method 1");
    }
    void method2(){
      method1();
    }
  }
  class Analyse8{
    public static void main (String[] args) {
      Method m = new Method();
      m.method2();
    }
  }

    /*This is method 1*/