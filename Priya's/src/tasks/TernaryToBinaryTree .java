package tasks;

import java.util.Scanner;

class Node{
    char data;
    Node left, right;
    Node(char key){
        data = key;
        left = right = null;
    }
}

class TernaryToBinaryTree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enthe the number of inputs");
        int t = sc.nextInt();
        

        while (t-- > 0) {
            String str = "";
            System.out.println("enter the ternary input");
            str = sc.next();
            Mainp obj = new Mainp();
            Node res = obj.convertExp(str, 0);
            System.out.println("the binary tree for the given input is: ");
            printInorder(res);
            System.out.println();
        }
    }

    public static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printInorder(node.left);
        printInorder(node.right);
    }
}

class Mainp
{
   
    public static Node convertExp(String str, int i)
    {
        
        if(i > str.length())
         return null;
         
       Node root = new Node(str.charAt(i));
        i++;
        if(i < str.length() && str.charAt(i) == '?')
         root.left = convertExp(str, i+1);
        if(i < str.length() && str.charAt(i) == ':')
         root.right = convertExp(str, i+1);
      
      return root;  
    }
}

