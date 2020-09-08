import java.util.*; 
 class StackDemo1
 { 
      public static void main(String args[]) 
    { 
        Stack<String> stack = new Stack<String>(); 
       stack.push("hi"); 
        stack.push("good"); 
        stack.push("morning"); 
        stack.push("hello"); 
        stack.push("everyone"); 
       System.out.println("Initial Stack: " + stack); 
     System.out.println("The element at the top of the"+ " stack is: " + stack.peek()); 
     stack.pop();
     System.out.println("after removing"+stack);
     System.out.println("print stack is empty or not"  +stack.empty());
System.out.println("print element found or not"  +stack.search("hello"));
     System.out.println("Final Stack: " + stack); 
    } 
}