import java.util.*; 
  
public class QueueDemo1 { 
  
    public static void main(String args[]) 
    { 
        Queue<String> Q = new LinkedList<String>(); 
  
        Q.offer("HI"); 
        Q.offer("GOOD"); 
        Q.add("MORNING"); 
        System.out.println("Initial Queue " + Q); 
        Q.remove(); 
       System.out.println("After Remove " + Q); 
       System.out.println("returns the peek element "+ Q.element()); 
       System.out.println("Poll Method " +Q.poll());
        System.out.println("Final Queue " + Q); 
    } 
} 