package interf;



interface Statictest{
    String  Pink = "pink colour";
}

class Test implements Statictest{
    public Test() {
        Pink = "red";
    }
}

public class Static{
    public static void main(String[] args) {
        System.out.println("STATIC FINAL TEST = "+Statictest.Pink);
    }
}