package java2blog.BinaryTree;

class sum 
{ 
  
static class Node  
{  
    int data;  
    Node left, right;  
} 
  
static class INT 
{ 
    int v; 
    INT(int a) 
    { 
        v = a; 
    } 
} 
  
static Node newnode(int data)  
{  
    Node node = new Node();  
    node.data = data;  
    node.left = node.right = null;  
    return (node);  
}  
    
static boolean sumSubtreeUtil(Node ptr, INT cur_sum, int sum)  
{  

    if (ptr == null)  
    {  
        cur_sum = new INT(0);  
        return false;  
    }  
   
    INT sum_left = new INT(0),  
        sum_right = new INT(0);  
    return (sumSubtreeUtil(ptr.left, sum_left, sum) ||  
            sumSubtreeUtil(ptr.right, sum_right, sum) ||  
        ((cur_sum.v = sum_left.v + sum_right.v + ptr.data) == sum));  
}  
 
static boolean sumSubtree(Node root, int sum)  
{   
    INT cur_sum = new INT( 0);  
  
    return sumSubtreeUtil(root, cur_sum, sum);  
}  

public static void main(String args[]) 
{  
    Node root = newnode(8);  
    root.left = newnode(5);  
    root.right = newnode(4);  
    root.left.left = newnode(9);  
    root.left.right = newnode(7);  
    root.left.right.left = newnode(1);  
    root.left.right.right = newnode(12);  
    root.left.right.right.right = newnode(2);  
    root.right.right = newnode(11);  
    root.right.right.left = newnode(3);  
    int sum = 22;  
  
    if (sumSubtree(root, sum))  
        System.out.println( "Yes");  
    else
        System.out.println( "No");  
}  
} 

