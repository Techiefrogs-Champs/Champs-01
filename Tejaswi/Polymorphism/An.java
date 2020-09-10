class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class An {
   public static void main(String[] args) {
    
     // declaration of object variable a1 of the Animal class
      Animal a1;
    
    // object creation of the Animal class
      a1 = new Animal();
      a1.displayInfo();
    // object creation of the dog class
      a1 = new Dog();
      a1.displayInfo();
   }
}