class Human {
    public int legs;
    public void display() {
        System.out.println("I am human.");
        System.out.println("I am a girl");
System.out.println("I have"+legs+"legs");
}
    }
public class First{
    public static void main( String[] args ) {
       Human h= new Human();
        h.legs = 2;
        h.display();
    }
}