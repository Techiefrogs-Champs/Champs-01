package MethodsExc;

class Iint {
    void printNum(){
        System.out.println("Value of i");
    }
}
class Jint extends Iint {
    void printNum(){
        System.out.println("value of j");
    }
}
class Methods7{
    public static void main(String[] args) {
        Jint a=new Jint();
        Iint b=new Iint();
        a.printNum();
        b.printNum();
    }
}