package Tasks;

class MergeTwoSortedLinkedListsReverse { 
  
    Node head; 
    static Node a, b; 

    static class Node { 
  
        int data; 
        Node next; 
 
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    void printlist(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    Node sortedmerge(Node node1, Node node2) { 
          
        if (node1 == null && node2 == null) { 
            return null; 
        } 
  
        Node res = null; 
 
        while (node1 != null && node2 != null) { 

            if (node1.data <= node2.data) { 
                Node temp = node1.next; 
                node1.next = res; 
                res = node1; 
                node1 = temp; 
            } else { 
                Node temp = node2.next; 
                node2.next = res; 
                res = node2; 
                node2 = temp; 
            } 
        } 
  

        while (node1 != null) { 
            Node temp = node1.next; 
            node1.next = res; 
            res = node1; 
            node1 = temp; 
        } 
  
        while (node2 != null) { 
            Node temp = node2.next; 
            node2.next = res; 
            res = node2; 
            node2 = temp; 
        } 
  
        return res; 
  
    } 
  
    public static void main(String[] args) { 
  
        MergeTwoSortedLinkedListsReverse list = new MergeTwoSortedLinkedListsReverse(); 
        Node result = null; 
 
        list.a = new Node(5); 
        list.a.next = new Node(10); 
        list.a.next.next = new Node(15); 
  
        list.b = new Node(2); 
        list.b.next = new Node(3); 
        list.b.next.next = new Node(20); 
  
        System.out.println("List a before merge :"); 
        list.printlist(a); 
        System.out.println(""); 
        System.out.println("List b before merge :"); 
        list.printlist(b); 
  
        result = list.sortedmerge(a, b); 
        System.out.println(""); 
        System.out.println("Merged linked list : "); 
        list.printlist(result); 
  
    } 
} 