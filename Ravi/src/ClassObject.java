package src;

public class ClassObject {
    int i = 1, j;
    String name1 = "ravi", name2;

    
    public ClassObject(){
        System.out.println("ID="+ i +"name is="+name1);
    }

    public ClassObject(int i, String stng) {
        j = i;
        name2 = stng;
        System.out.println("ID=" + i + "name is=" + name2);
    }

    // public ClassObject() {
    //     System.out.println("Defacult Constructor");
    // }

    public void m1() {
        System.out.println("This is M1 Method");     
    }
  
 

    public static void main(String[] args) {
        var obj1 = new ClassObject();
        var obj2 = new ClassObject(2, "teja");
        obj1.m1();
       
        

       
    }
}
