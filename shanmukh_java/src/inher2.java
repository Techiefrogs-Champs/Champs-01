class Animal2 {
    protected String type="animal";
  }
  
  class Dog1 extends Animal2 {
    public String type="mammal";
  
    public void printType() {
      System.out.println("I am a " + type);
      System.out.println("I am an " + super.type);
    }
  }
  
  class inher2 {
    public static void main(String[] args) {
      Dog1 dog1 = new Dog1();
      dog1.printType();
    }
  }