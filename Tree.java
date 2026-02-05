import java.util.Scanner;

public class Tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public int height(Node root) {
        if (root == null) {
            return -1; 
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public int leafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafNodes(root.left) + leafNodes(root.right);
    }  
     
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println("\nPreorder Traversal:");

      preorder(root);
        System.out.println("\nPostorder Traversal:");
        postorder(root);
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter number of nodes: ");
    // int n = scanner.nextInt();
    // Node[] nodes = new Node[n]; 
    // for (int i = 0; i < n; i++) {
    //     nodes[i] = new Node(i);
    // }
    // for (int i = 0; i < n; i++) {
    //     System.out.print("Enter left child of node " + i + " (-1 for null): ");
    //     int leftIndex = scanner.nextInt();
    //     if (leftIndex != -1) {
    //         nodes[i].left = nodes[leftIndex];
    //     }
    //     System.out.print("Enter right child of node " + i + " (-1 for null): ");
    //     int rightIndex = scanner.nextInt();
    //     if (rightIndex != -1) {
    //         nodes[i].right = nodes[rightIndex];
    //     }
    // }
}
}
