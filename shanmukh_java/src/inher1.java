class Animal1 {

    public void display(){
      System.out.println("I am an animal");
    }
  }
  
  class Dog extends Animal1 {
  
    
    public void display(){
      System.out.println("I am a dog");
    }
  
    public void printMessage(){
      display();
    }
  }
  
  class inher1 {
    public static void main(String[] args) {
      Dog dog1 = new Dog();
      dog1.printMessage();
    }
  }