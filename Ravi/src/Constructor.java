package src;

public class Constructor {

    Constructor(){
        System.out.println("Default Constructor called");
    }

    public static void main(String args[]) {
        Constructor defacult=new Constructor(); 

        class2 obj2 = new class2();
        obj2.M1(11);
        obj2.M2();

        class3 obj3 = new class3(2, "TEJA");

    }
}

class class2 {
    private int a;
    private int i = 10;
    private String name = "RAVI";

    void M1(int a) {
        this.a=a;
        System.out.println(a);     
    }

    public void M2() {
         int a=100;
         int b=200;
    	System.out.println(a);
        System.out.println(b);   
    }

     class2(){
        System.out.println("ID="+ i +"name is="+name);
    }
}

class class3 {
     public int j;
     private String name2;

     class3(int i, String stng){
        this.j = i;
        this.name2 = stng;
        System.out.println("ID=" + i + "name is=" + name2);
    }
}

