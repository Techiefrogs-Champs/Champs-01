package MethodsExc;

public class Methods2 {
    static void myName(String s, int n) {
         System.out.println(s + " is "+ n +" years old");
    }
    public static void myAge(int n,String s){
        System.out.println(n + " is age of "+s);
    }
    public static void main(String[] args) {
        myName("Phani",19);
        myAge(19, "Phani");
    }

   
}