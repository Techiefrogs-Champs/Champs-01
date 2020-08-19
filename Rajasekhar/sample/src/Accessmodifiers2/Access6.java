package src.Accessmodifiers2;
//Accessing private modifier from other package i.e  Accessmodifiers and Access7

import  src.Accessmodifiers.Access7;

public class Access6 {
    public static void main(String[] args) {
        Access7 obj = new Access7();
        System.out.println("Accessing private modifier from other package");
        System.out.println("captain of indian cricket team in 2011 world cup "+obj.Captain+" And "+"His age is "+obj.Age);
        
    }
    
}