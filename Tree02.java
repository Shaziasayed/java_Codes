public class Tree02 {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static Node LowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }
        if (root.data > p.data && root.data > q.data) {
            return LowestCommonAncestor(root.left, p, q);
        }
        if (root.data < p.data && root.data < q.data) {
            return LowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    public Boolean hasPathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.data;
        }
        int remainingSum = targetSum - root.data;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
    public static void printRightNodes(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printRightNodes(root.right);
    }
    public Boolean isBalanced(Node root) {
        return checkBalance(root) != -1;
    }
    public static int checkBalance(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = checkBalance(root.left);
        int rightHeight = checkBalance(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        Tree02 tree = new Tree02();
        Node root = tree.new Node(6);
        root.left = tree.new Node(2);
        root.right = tree.new Node(8);
        root.left.left = tree.new Node(0);
        root.left.right = tree.new Node(4);
        root.right.left = tree.new Node(7);
        root.right.right = tree.new Node(9);

        Node p = root.left; // Node with value 2
        Node q = root.right; // Node with value 8

        Node lca = LowestCommonAncestor(root, p, q);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + p.data + " and " + q.data + " is: " + lca.data);
        } else {
            System.out.println("Lowest Common Ancestor does not exist.");
        }
        int targetSum = 10;
        boolean hasPath = tree.hasPathSum(root, targetSum);
        if (hasPath) {
            System.out.println("There is a root-to-leaf path with the sum " + targetSum);
        } else {
            System.out.println("There is no root-to-leaf path with the sum " + targetSum);
        }
        System.out.println("Rightmost nodes in the tree:");
        printRightNodes(root);
        boolean balanced = tree.isBalanced(root);
        if (balanced) {
            System.out.println("\nThe tree is balanced.");
        } else {
            System.out.println("\nThe tree is not balanced.");
        }
}
}
