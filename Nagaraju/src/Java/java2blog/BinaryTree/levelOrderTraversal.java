import java.util.Queue;
import java.util.LinkedList;


class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
 
class BinaryTree {
    Node root;

    void printLevelOrder() 
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) 
        {
 
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
 
    public static void main(String args[]) {

        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(40);
        tree_level.root.left = new Node(20);
        tree_level.root.right = new Node(60);
        tree_level.root.left.left = new Node(10);
        tree_level.root.left.right = new Node(30);
        tree_level.root.right.left = new Node(50);
        tree_level.root.right.right = new Node(70);
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }

	public String getLeafCount() {
		return null;
	}
}
