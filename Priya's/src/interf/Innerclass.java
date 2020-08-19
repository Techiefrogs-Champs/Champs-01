package interf;
import interf.*;

public class Innerclass {
    public SimpleInterface get() {
    class SI implements SimpleInterface{
    public void f() { 
        System.out.println("SI.f");
     }
    } 
    return new SI();
 }
 public static void main(String args[]) {
 SimpleInterface si =
 new Innerclass().get();
 si.f();
 }
} 