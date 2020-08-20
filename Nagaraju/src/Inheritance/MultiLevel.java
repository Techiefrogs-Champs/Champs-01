package Inheritance;

class A 
{ 
    public void Techie() { 
        System.out.println("Techie"); 
    } 
} 
class B extends A { 
    public void Frogs() { 
        System.out.println("Frogs"); 
    } 
} 
class C extends B { 
    public void Student() { 
        System.out.println("Student"); 
    } 
} 
public class MultiLevel { 
    public static void main(String[] args) { 
        C g = new C(); 
        g.Techie(); 
        g.Frogs(); 
        g.Student(); 
    } 
}