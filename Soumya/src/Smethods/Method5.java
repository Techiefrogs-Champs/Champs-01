package Smethods;

class Degree {
    void course(){
    System.out.println("I got a degree");
    }
   }
    class Undergraduate extends Degree{
        void junior(){
            System.out.println("I am an Undergraduate");
        }

    }
    class Postgraduate extends Degree{
        void senior(){
            System.out.println("I am a Postgraduate");
        }
    }
public class Method5 {
    public static void main(String[] args) {
        Postgraduate p=new Postgraduate();
        Undergraduate u=new Undergraduate();
        p.course();
        p.senior();
        u.course();
        u.junior();

    }
}