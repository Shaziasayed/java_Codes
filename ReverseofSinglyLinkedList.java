import org.w3c.dom.Node;

public class ReverseofSinglyLinkedList {
Node head;
private int size;

ReverseofSinglyLinkedList() {
this.size = 0;
}

class Node {
String data;
Node next;

Node(String data) {
this.data = data;
this.next = null;
size++;
}
}
public void addFirst(String data) {
Node newNode = new Node(data);

if (head == null) {
head = newNode;
return;
}

newNode.next = head;
head = newNode;
}

public void addLast(String data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
return;
}

Node currNode = head;
while (currNode.next != null) {
currNode = currNode.next;
}

currNode.next = newNode;
}

public void printList() {
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



public void deleteFirst() {
if (head == null) {
System.out.println("This list is empty");
return;
}
size--;
head = head.next;
}

public void deleteLast() {
if (head == null) {
System.out.println("This list is empty");
return;
}
size--;

if (head.next == null) {
head = null;
return;
}

Node secondLast = head;
Node lastNode = head.next;
while (lastNode.next != null) {
lastNode = lastNode.next;
secondLast = secondLast.next;
}

secondLast.next = null;
}

public int getSize() {
return size;
}

// Method to reverse a LinkedList.
public void reverseIterate() {

if (head == null || head.next == null) {
return;
}

Node prevNode = head;
Node currNode = head.next;

while (currNode != null) {
Node nextNode = currNode.next;
currNode.next = prevNode;


prevNode = currNode;
currNode = nextNode;
}
head.next = null;
head = prevNode;
Boolean palindrome(){
    Node slow=head,fast =head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
}
Node secondHalf=reverseIterate(slow.next);
Node firstHalf=head;
Node secondcopy=secondHalf;
Boolean result=true;
while(secondHalf!=null){
    if(firstHalf.data!=secondHalf.data){
        result=false;
        break;
    }
    firstHalf=firstHalf.next;
    secondHalf=secondHalf.next;

}
}
public void NthPositionfromEnd(int n){
    Node fast=head;
    Node slow=head;
    
    for(int i=0;i<n;i++){
        if(fast==null) return;
        fast=fast.next;
    }
    while(fast!=null){
        slow=slow.next;
        fast=fast.next;
    }
    return slow;
}

public static Node getIntersectionNode(Node headA, Node headB) {

        if (headA == null || headB == null) {
            return null;
        }

        Node p1 = headA;
        Node p2 = headB;

        // since lengths are same
        while (p1 != null && p2 != null) {

            if (p1 == p2) {   // reference comparison
                return p1;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return null; // no intersection
    }

}

public static void main(String args[]) {
ReverseofSinglyLinkedList list = new ReverseofSinglyLinkedList();
list.addFirst("a");
list.addFirst("is");
list.addFirst("This");
list.printList();

list.addLast("list");
list.printList();

list.reverseIterate();
list.printList();
}
}
 //public class SinglyLinkedList {
// Node head;
// private int size;

// SinglyLinkedList() {
// this.size = 0;
// }

// class Node {
// String data;
// Node next;

// Node(String data) {
// this.data = data;
// this.next = null;
// size++;
// }
// }

// public void addFirst(String data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(String data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }

// Node currNode = head;
// while (currNode.next != null) {
// currNode = currNode.next;
// }

// currNode.next = newNode;
// }

// public void printList() {
// if (head == null) {
// System.out.println("List is empty");
// return;
// }

// Node currNode = head;
// while (currNode != null) {
// System.out.print(" " + currNode.data + " " + "-->" + " ");
// currNode = currNode.next;
// }

// System.out.println("Null");
// }

// public void deleteFirst() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;
// head = head.next;
// }

// public void deleteLast() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;

// if (head.next == null) {
// head = null;
// return;
// }

// Node secondLast = head;
// Node lastNode = head.next;
// while (lastNode.next != null) {
// lastNode = lastNode.next;
// secondLast = secondLast.next;
// }

// secondLast.next = null;
// }

// public int getSize() {
// return size;
// }

// // Method to reverse a LinkedList.
// public Node reverseRecursive(Node head) {
// // Base case
// if (head == null || head.next == null) {
// return head;
// }

// Node newHead = reverseRecursive(head.next);
// head.next.next = head;
// head.next = null;

// return newHead;
// }

// public static void main(String args[]) {
// SinglyLinkedList list = new SinglyLinkedList();
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// list.printList();

// list.addLast("list");
// list.printList();

// list.head = list.reverseRecursive(list.head);
// list.printList();
// }
// }
/*---------------------------------------------------------------- */
