class A{
    int i;
    public void printNum(){
        System.out.println(i);
    }
}
public class Program_7 extends A {
    int j;
    public void printNum(){
        System.out.println(j);
    }
    public static void main(String[] args) {
        Program_7 obj  = new Program_7();
        obj.i=458;
        obj.printNum();
        obj.j=256;
        obj.printNum();
    }
}
