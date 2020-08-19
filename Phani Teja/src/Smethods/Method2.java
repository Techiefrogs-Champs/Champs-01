package Smethods;

public class Method2 {
    static void name(String s, int n) {
        System.out.println(s + " is "+ n +" years old");
   }
   public static void age(int n,String s){
       System.out.println(n + " is age....of "+s);
   }
   public static void main(String[] args) {
       name("Soumya",20);
       age(20, "Soumya");
   }
}