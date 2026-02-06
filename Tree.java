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
    public int countInternalNodes(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + countInternalNodes(root.left) + countInternalNodes(root.right);
    }
    public int MaxElement(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = MaxElement(root.left);//this will recursively find the maximum element in the left subtree of the current node.
        int rightMax = MaxElement(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));//this will return the maximum element in the tree by comparing the current node's data with the maximum values found in the left and right subtrees.
    }
    public int MinElement(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = MinElement(root.left);
        int rightMin = MinElement(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }
    public boolean identicalTrees(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data) &&
                identicalTrees(root1.left, root2.left) &&//
                identicalTrees(root1.right, root2.right);
    }
    public int countOneChildNodes(Node root) {//this method counts the number of nodes in a binary tree that have exactly one child.
        if (root == null) {
            return 0;
        }
        int leftCount = countOneChildNodes(root.left);
        int rightCount = countOneChildNodes(root.right);
        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
            return 1 + leftCount + rightCount;//
        }
        return leftCount + rightCount;
    }
    public boolean OneLeafNode(Node root) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        boolean leftLeaf = OneLeafNode(root.left);
        boolean rightLeaf = OneLeafNode(root.right);
        return leftLeaf || rightLeaf;
    }
    public int replaceWithSum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = replaceWithSum(root.left);
        int rightSum = replaceWithSum(root.right);
        int oldValue = root.data;
        root.data = leftSum + rightSum;
        return oldValue + root.data;
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
        Tree tree = new Tree();
        System.out.println("\nNumber of nodes: " + tree.countNodes(root));
        System.out.println("Height of tree: " + tree.height(root));
        System.out.println("Number of leaf nodes: " + tree.leafNodes(root));
        System.out.println("Number of internal nodes: " + tree.countInternalNodes(root));
        System.out.println("Maximum element: " + tree.MaxElement(root));
        System.out.println("Minimum element: " + tree.MinElement(root));
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        System.out.println("Identical trees: " + tree.identicalTrees(root, root2));
        System.out.println("Number of nodes with one child: " + tree.countOneChildNodes(root));
        System.out.println("At least one leaf node: " + tree.OneLeafNode(root));
        tree.replaceWithSum(root);
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
