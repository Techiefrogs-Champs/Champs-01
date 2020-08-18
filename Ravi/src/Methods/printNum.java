package src.Methods;

class printNum1{
    int i;
    public void printNum(){
        System.out.println(i);
    }
}
class printNum2 extends printNum1 {
    int j;
    public void printNum(){
        super.printNum();
        System.out.println(j);
    }
}

public class printNum {
    public static void main(String args[]) {
      
        printNum2 obj=new printNum2();
        obj.i=4;
        obj.j=5;
        obj.printNum();

    }
    
}