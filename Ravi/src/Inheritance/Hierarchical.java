package src.Inheritance;
class one 
{ 
    public void print_green() 
    { 
        System.out.println("Green"); 
    } 
} 
  
class two extends one 
{ 
    public void print_blue() 
    { 
        System.out.println("blue"); 
    } 
} 
  
class three extends one 
{ 
    public void print_yellow() 
    { 
        System.out.println("yellow"); 
    } 
} 
public class Hierarchical {
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.print_yellow(); 
        g.print_green();
        two t = new two(); 
        t.print_blue(); 
       
    } 
    
}