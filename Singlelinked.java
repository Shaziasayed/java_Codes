
public class Singlelinked {
// Creating a Head node.
Node head;

// Creating a nested class named Node.
class Node {
String data;
Node next; // Node has the property called next which we are using here which stores memory
// reference of next node.

// Creating constructor for Node class.
Node(String data) {
this.data = data; // this.data is pointing to the data variable/property present inside the Node
// class.
this.next = null; // Initially for all the nodes the next node will be null hence no list is
// created.
}
}
// // Method to add element at the beginning of a LinkedList.
public void addFirst(String data) {
Node newNode = new Node(data);

// // To check whether any LinkedList exist or not for now.
if (head == null) { // means no LinkedList exist till now so,
head = newNode;
return;
}

// In case a LinkedList already exists then,
newNode.next = head;
head = newNode;
}

// Method to add element at the end of the LinkedList.
public void addLast(String data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
return;
}

// To traverse a LinkedList we have to crate a current node.
Node currNode = head;
// We will traverse until the next node points to null.
while (currNode.next != null) {
currNode = currNode.next;
}

// As soon as it reaches the last node, we'll change,
currNode.next = newNode;
}

// // To print the list :- It is similar to adding element at last.
public void printList() {
// Checking if head is already null.
if (head == null) {
System.out.println("List is empty");
return;
}

Node currNode = head;
while (currNode != null) {
System.out.print(" " + currNode.data + " " + "-->" + " ");
currNode = currNode.next;
}

System.out.println("Null");
}

// // You might be thinking that why we made a currNode we can use Head as a
// // current node.
// // It is because we should never perform any manipulation operation on Head
// e.g.
// // making head.next as Head which will cut-off the previous Head and we
// cannot
// // track it back, because if we lose Head then there is now way of tracking
// it
// // back i.e. it's gone and your data is lost.
// // By doing as I did above, we can put the value of Head in current node
// without
// // losing the actual head and in this way the value of current node is
// getting
// // updated.

public static void main(String args[]) {
// Creating object of the Singlelinked class
Singlelinked list = new Singlelinked();
list.addFirst("a");
list.addFirst("is");
list.addFirst("This");
list.printList();

list.addLast("list");
list.printList();
}
}
/*---------------------------------------------------------------- */

