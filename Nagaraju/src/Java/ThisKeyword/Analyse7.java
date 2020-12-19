package ThisKeyword;
/*Invoke current class method*/
class Method7{
    void method1(){
      System.out.println("This is method 1");
    }
    void method2(){
      this.method1();
    }
  }
  class Analyse7{
    public static void main (String[] args) {
      Method m = new Method();
      m.method2();
    }
  }

  /*This is method 1*/