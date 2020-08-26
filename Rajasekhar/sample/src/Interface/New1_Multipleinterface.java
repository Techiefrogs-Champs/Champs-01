package Interface;

interface FirstInterface {
    public void myMethod(); 
  }
  
  interface SecondInterface {
    public void myOtherMethod(); 
  }
  
  class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
      System.out.println("implementation of FirstInterface mathod ");
    }
    public void myOtherMethod() {
      System.out.println("implementation of SecondInterface mathod");
    }
  }
  
  class New1_Multipleinterface {
    public static void main(String[] args) {
      DemoClass myObj = new DemoClass();
      myObj.myMethod();
      myObj.myOtherMethod();
    }
  }
   
