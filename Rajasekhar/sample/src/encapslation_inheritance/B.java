package src.encapslation_inheritance;

class A {
    private String name;
    public String getName() {
      return name;
    }
    public void setName(String newName) {
      name = newName;
    }
  }
  public class B {
    public static void main(String[] args) {
      A myObj = new A();
      myObj.setName("Techie Frogs"); 
      System.out.println(myObj.getName());
    }
  }