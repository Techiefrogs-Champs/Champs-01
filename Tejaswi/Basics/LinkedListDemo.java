import java.util.*;
class LinkedListDemo
 {  
  
        public static void main(String [] args)  
        {  
           LinkedList<String> ll=new LinkedList<String>();  
           ll.add("cse");  
           ll.add("hi");  
           ll.add("hello");  
           ll.add("ece");  
           ll.add("eee");  
           ll.add("mech");  
           ll.add("it");  
           ll.add("ai");  
           ll.add("civil");  
           ll.add("ml");  
           System.out.println("Initial list of elements: "+ll);    
              ll.remove("cse2");  
              System.out.println("After removing : "+ll);   
              ll.remove(0);  
              System.out.println("After  removing element  by using index method: "+ll);   
              LinkedList<String> ll2=new LinkedList<String>();  
              ll2.add("iot");  
              ll2.add("ds");  
         // Adding new elements to arraylist  
              ll.addAll(ll2);  
              System.out.println("Updated list : "+ll);   
         //Removing all the new elements from arraylist  
              ll.removeAll(ll2);  
              System.out.println("After  using removeAll method: "+ll);   
              ll.removeFirst();  
              System.out.println("After using removeFirst method: "+ll);  
              ll.removeLast();  
              System.out.println("After using removeLast method: "+ll);  
              ll.removeFirstOccurrence("eee");  
              System.out.println("After using removeFirstOccurrence method: "+ll);  
              ll.removeLastOccurrence("ml");  
              System.out.println("After using removeLastOccurrence method: "+ll);  
              ll.clear();  
              System.out.println("After using clear() method: "+ll);   
       }  
    }       