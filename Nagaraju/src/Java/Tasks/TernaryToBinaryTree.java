package Tasks;
import java.util.*;

class Node {
    char data; 
    Node left, right; 
    Node(char key) {
        data = key; 
        left = right = null; 
    } 
}

class BinaryTree {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Number of Inputs:"); 
        int t = sc.nextInt(); 

        while(t--> 0) {
            String str = "";
            System.out.println("Enter the ternary input:");
            str = sc.next(); 
            TTBT ttbt = new TTBT(); 
            Node res = ttbt.convertExp(str, 0);
            System.out.println("Binary Tree for the given Ternary input:");
            printInorder(res);
        
        }
    }

    public static void printInorder(Node node){
        if(node == null)
        return;
        System.out.println(node.data +" ");
        printInorder(node.left);
        printInorder(node.right);
    }
}
class TTBT{
    public static Node convertExp(String str, int i){
        if(i> str.length())
            return null;

        Node root = new Node(str.charAt(i));
        i++;
        if(i<str.length()&&str.charAt(i)=='?')
            root.left = convertExp(str, i+1);
        if(i<str.length()&&str.charAt(i)==':')
            root.right = convertExp(str, i+1);
        return root;
    }
}


