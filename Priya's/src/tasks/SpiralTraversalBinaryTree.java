package tasks;

class Node2 { 
    int data; 
    Node2 left, right; 
  
    public Node2(int d) 
    { 
        data = d; 
        left = right = null; 
    } 
} 
  
class SpiralTraversalBinaryTree { 
    Node2 root; 
  
    void printSpiral(Node2 node) 
    { 
        int h = height(node); 
        int i; 
        boolean ltr = false; 
        for (i = 1; i <= h; i++) { 
            printGivenLevel(node, i, ltr); 

            ltr = !ltr; 
        } 
    } 
  
    int height(Node2 node) 
    { 
        if (node == null) 
            return 0; 
        else { 
            int lheight = height(node.left); 
            int rheight = height(node.right); 

            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
  
    void printGivenLevel(Node2 node, int level, boolean ltr) 
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.data + " "); 
        else if (level > 1) { 
            if (ltr != false) { 
                printGivenLevel(node.left, level - 1, ltr); 
                printGivenLevel(node.right, level - 1, ltr); 
            } 
            else { 
                printGivenLevel(node.right, level - 1, ltr); 
                printGivenLevel(node.left, level - 1, ltr); 
            } 
        } 
    } 

    public static void main(String[] args) 
    { 
        SpiralTraversalBinaryTree  tree = new SpiralTraversalBinaryTree (); 
        tree.root = new Node2(1); 
        tree.root.left = new Node2(2); 
        tree.root.right = new Node2(3); 
        tree.root.left.left = new Node2(7); 
        tree.root.left.right = new Node2(6); 
        tree.root.right.left = new Node2(5); 
        tree.root.right.right = new Node2(4); 
        System.out.println("Spiral order traversal of Binary Tree is "); 
        tree.printSpiral(tree.root); 
    } 
} 

