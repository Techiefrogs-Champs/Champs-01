package tasks;

import java.util.LinkedList;
import java.util.Scanner;

class input3 {
 
    Scanner scan;
    LinkedList<String> a;
    LinkedList<String> b;
    int n,m;
    
    void getVal() {
        
        scan = new Scanner(System.in);
        a = new LinkedList<String>();
        
        System.out.println("Linked List - Create & Insert");
        
        System.out.println("\nEnter 'n' value");
        n = scan.nextInt();
        
        System.out.println("Enter the 1st Linked List data");
 
        for(int i=0; i<n; i++) {
            
            a.add(scan.next());
        }

        b = new LinkedList<String>();
        System.out.println("\nEnter 'm' value");
        m = scan.nextInt();
        System.out.println("Enter the 2nd Linked List data");
        for(int j=0; j<m; j++) {
            b.add(scan.next());
        }
    }
    
    void display() {
        
        System.out.println("\nThe 1st Linked List");
        for(int i=0; i<a.size(); i++) {
            
            System.out.println(a.get(i));
        }

        System.out.println("\nThe 2nd Linked List");
        for(int j=0; j<b.size(); j++) {
            
            System.out.println(b.get(j));
        }
    }


    static class MergeTwoSortedLinkedListsReverse {

        Node head;
        static Node A, B;

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

            input3 obj = new input3();

            obj.getVal();
            obj.display();

         

            result = list.sortedmerge(A, B);
            System.out.println("");
            System.out.println("Merged linked list : ");
            list.printlist(result);

        }
    }
}
