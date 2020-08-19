package src.Accessmodifiers;
//Accessing private modifier from same  Accessmodifiers and Access9.java

public class Access10 {
    public static void main(String[] args) {
        Access9 obj = new Access9();
        System.out.println("Accessing protected modifier from same package");
        System.out.println("captain of indian cricket team in 2011 world cup "+obj.Captain+" And "+"His age is "+obj.Age);
        
    }
    
}