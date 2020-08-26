package src.Abstraction;

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
      System.out.println(" this is regular method");
    }
  }
  class Pig extends Animal {
    public void animalSound() {
      System.out.println(" implementation of abstact method animalsound");
      System.out.println("The pig says: wee wee");
    }
  }
  class MyMainClass {
    public static void main(String[] args) {
      Pig myPig = new Pig();
      myPig.animalSound();
      myPig.sleep();
    }
  }
   