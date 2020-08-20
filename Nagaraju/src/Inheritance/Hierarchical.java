package Inheritance;
class x { 
    public void Techie() { 
        System.out.println("Techie"); 
    } 
} 
class y extends x { 
    public void Frogs() { 
        System.out.println("Frogs"); 
    } 
}  
class z extends x {   
} 
public class Hierarchical { 
    public static void main(String[] args) { 
        z g = new z(); 
        g.Techie(); 
        y t = new y(); 
        t.Frogs();  
    } 
} 