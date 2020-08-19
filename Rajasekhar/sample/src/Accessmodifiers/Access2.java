package src.Accessmodifiers;
//Accessing Default modifier from same  Accessmodifiers and Access1.java

public interface Access2 {
    public static void main(String[] args) {
        Access1 obj = new Access1();
        System.out.println("Accessing Default modifier");
        System.out.println("captain of indian cricket team in 2011 world cup "+obj.Captain+" And "+"His age is "+obj.Age);
        
    }
    
}