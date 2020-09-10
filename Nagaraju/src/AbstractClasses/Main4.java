
abstract class Constructor{
    Constructor(){
        System.out.println("This is constructor of Abstract Class");
    }
    abstract void a_method();
    
    void method(){
        System.out.println("This is normal method of Abstract Class");
    }
}
class Subclass extends Constructor{
    void a_method() {
  System.out.println("This is first subclass");
 }
}
public class Main4 {
    public static void main(String[] args){
        Subclass obj_1=new Subclass();
        obj_1.a_method();
        Subclass obj_2=new Subclass();
        obj_2.method();

    }
    
}