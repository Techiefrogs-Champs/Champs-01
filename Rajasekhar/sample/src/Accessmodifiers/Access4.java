package src.Accessmodifiers;
//Accessing public modifier from same  Accessmodifiers and Access3.java

public class Access4 {
    public static void main(String[] args) {
        Access3 obj = new Access3();
        System.out.println("Accessing public modifier from same package");
        System.out.println("captain of indian cricket team in 2011 world cup "+obj.Captain+" And "+"His age is "+obj.Age);
        
    }
    
}