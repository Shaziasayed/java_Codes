
public class PrintTreeRoot {
// This Node class will represent each Node of a tree.
static class Node {
int data;
Node left;
Node right;

Node(int data) {
this.data = data;
this.left = null;
this.right = null;0
}
}

static class BinaryTree {
// Defining a static variable with -1 so that we can traverse throughout the
//array.
static int idx = -1;

// This will take all the Node from a Tree and will return it to Root Node
public static Node buildTree(int nodes[]) {
idx++;

if (nodes[idx] == -1) {
return null;
}

Node newNode = new Node(nodes[idx]);
newNode.left = buildTree(nodes);
newNode.right = buildTree(nodes);

return newNode;
}
}

public static void main(String[] args) {
int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

BinaryTree tree = new BinaryTree();
// This will represent the complete Tree.
Node root = tree.buildTree(nodes);

System.out.println(root.data);
}
}