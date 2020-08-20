package src.Accessmodifiers2;
//Accessing public modifier from other package i.e  Accessmodifiers and Access3
import  src.Accessmodifiers.Access3;

public class Access5 {
    public static void main(String[] args) {
        Access3 obj = new Access3();
        System.out.println("Accessing public modifier from other package");
        System.out.println("captain of indian cricket team in 2011 world cup "+obj.Captain+" And "+"His age is "+obj.Age);
        
    }
    
}