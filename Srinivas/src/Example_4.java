class Animal {
    protected int legs=4;
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Example_4 extends Animal {
    public static void main(String[] args) {

        
        Example_4 dog = new Example_4();
        dog.display();
        System.out.println(" animal legs  "+dog.legs);
    }
}