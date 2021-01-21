import java.util.Deque;
import java.util.LinkedList;

class spiralOrderTraversal { 
      
    static class Node {  
        int data;  
        Node left, right;  
        Node(int val)  {  
            data = val;  
            left = null;  
            right = null;  
        }  
    };  
    
    static void spiralOrder(Node root)  {  
    
        Deque<Node> d = new LinkedList<Node>();  
        d.addLast(root);  
        int dir = 0;  
        while (d.size() > 0)  {  
            int size = d.size();  
            while (size-->0) {  
    
                if (dir == 0)  {  
                    Node temp = d.peekLast();  
                    d.pollLast();  
                    if (temp.right != null)  
                        d.addFirst(temp.right);  
                    if (temp.left != null)  
                        d.addFirst(temp.left);  
                    System.out.print(temp.data + " ");  
                }  
                else {  
                    Node temp = d.peekFirst(); 
                    d.pollFirst();  
                    if (temp.left != null)  
                        d.addLast(temp.left);  
                    if (temp.right != null)  
                        d.addLast(temp.right);  
                    System.out.print(temp.data + " ");  
                }  
            } 
            System.out.println(); 
            dir = 1 - dir;  
        }  
    } 
    
    public static void main(String args[])  {  
        Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(30);  
        root.left.left = new Node(40);  
        root.left.right = new Node(60);  

        spiralOrder(root);  
    }  
} 
