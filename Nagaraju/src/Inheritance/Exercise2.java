class Parent2{
    protected void display() {
        System.out.println("This is parent class");
    }

}

class Exercise2 extends Parent2 {
    void show() {

        System.out.println("This is Child class");
    }

    public static void main(String[] args) {
        // Parent2 p=new Parent2();
        Exercise2 e = new Exercise2();
        // p.display();
        e.show();
        e.display();
    }

}