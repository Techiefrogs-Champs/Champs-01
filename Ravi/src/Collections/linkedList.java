import java.util.*;
public class linkedList {

    public static void main(String args[]){

      LinkedList<String> linkedlist = new LinkedList<String>();


       linkedlist.add("Item1");
       linkedlist.add("Item5");
       linkedlist.add("Item3");
       linkedlist.add("Item6");
       linkedlist.add("Item2");
       linkedlist.add("Item7");
       linkedlist.add("Item8");
       linkedlist.add("Item9");

      
       System.out.println("Linked List Content: " +linkedlist);

      
       linkedlist.addFirst("First Item");
       linkedlist.addLast("Last Item");
       System.out.println("LinkedList Content after addition: " +linkedlist);


        LinkedList<String> list=new LinkedList<String>();

        list.add("Steve");
        list.add("Carl");
        list.add("Raj");
  
        list.addFirst("Negan");
     
        list.addLast("Rick");
       
        list.add(2, "Glenn");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
      }
}