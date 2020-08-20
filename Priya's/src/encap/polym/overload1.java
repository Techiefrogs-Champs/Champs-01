package encap.polym;

public class overload1 {
    public void m1(double a) {
        System.out.println(a * a);
    }

    public void m1(float a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        overload1 t = new overload1();
     t.m1(2); 
 } 
}