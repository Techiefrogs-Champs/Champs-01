package src.Accessmodifiers;
//Accessing private modifier from same  Accessmodifiers and Access7.java

public class Access8 {
    public static void main(String[] args) {
        Access7 obj = new Access7();
        System.out.println("Accessing private modifier from same package");
        System.out.println("captain of indian cricket team in 2011 world cup "+obj.Captain+" And "+"His age is "+obj.Age);
        
    }
    
}