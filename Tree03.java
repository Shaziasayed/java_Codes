
public class Tree03 {
    static class Node { 
        
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }               
    public static void Mirror(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
    public static void inorder(Node root){
        if(root==null) 
            return;
        inorder(root.left);

        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {

       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    
        Mirror(root);
    
        inorder(root);
    }
}

