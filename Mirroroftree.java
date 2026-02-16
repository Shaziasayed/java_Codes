

public class Mirroroftree {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void MirrorBinaryTree(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        MirrorBinaryTree(root.left);
        MirrorBinaryTree(root.right);
    }
    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        System.out.println("Original Tree:");
        printInorder(root);
        MirrorBinaryTree(root);
        System.out.println("\nMirrored Tree:");
        printInorder(root);

    }
}
