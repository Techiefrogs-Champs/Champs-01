class Base{
  void disp(){
    System.out.println("this is base class");
  }
}

class Derived{
  void disp(){
    System.out.println("this is sub class");
    super.disp();
  }
}

public class Main() {
  public static void main(String[] args) {
    Derived d = new Derived();
    d.disp();
  }
}