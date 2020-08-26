package Interface;

interface Animal {
    public void animalSound(); 
    public void sleep(); 
  }
  
  class Pig implements Animal {
    public void animalSound() {
      System.out.println("Implementation of interface method animalsound");
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      System.out.println("implementation of another interface method sleep");
    }
  }
  
  class New1_interface {
    public static void main(String[] args) {
      Pig myPig = new Pig();  
      myPig.animalSound();
      myPig.sleep();
    }
  }