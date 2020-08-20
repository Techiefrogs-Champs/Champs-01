package src.Accessmodifiers2;
//Accessing protected modifier from other package i.e  Accessmodifiers and Access9

import  src.Accessmodifiers.Access9;

public class Access11 extends Access9{
    public static void main(String[] args) {
        Access11 obj = new Access11();
        System.out.println("Accessing protected modifier from other package using inheritance");
        System.out.println("captain of indian cricket team in 2011 world cup "+obj.Captain+" And "+"His age is "+obj.Age);
        
    }
    
}