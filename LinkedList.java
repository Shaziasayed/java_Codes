public class LinkedList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {// Only one element
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

    public void print() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }
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
    }
    private Node reverse(Node node) {
    Node prev = null;
    Node curr = node;

    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}


    boolean isPalindrome() {

    if (head == null || head.next == null) return true;

    Node slow = head, fast = head;

    // find middle
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // reverse second half
    Node secondHalf = reverse(slow.next);
    Node firstHalf = head;

    Node copySecond = secondHalf; // for restoration
    boolean result = true;

    while (secondHalf != null) {
        if (!firstHalf.data.equals(secondHalf.data)) {
            result = false;
            break;
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }

    // restore list
    slow.next = reverse(copySecond);

    return result;
}
public Node nthFromEnd(int n) {

    if (head == null || n <= 0) return null;

    Node fast = head;
    Node slow = head;

    // move fast n steps ahead
    for (int i = 0; i < n; i++) {
        if (fast == null) return null;
        fast = fast.next;
    }

    // move both until fast reaches end
    while (fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    return slow;  // nth node from end
}
public void deleteNthFromEnd(int n) {

    if (head == null || n <= 0) return;

    Node dummy = new Node(""); // dummy node
    dummy.next = head;

    Node fast = dummy;
    Node slow = dummy;

    // move fast n+1 steps
    for (int i = 0; i <= n; i++) {
        if (fast == null) return;
        fast = fast.next;
    }

    // move both pointers
    while (fast != null) {
        fast = fast.next;
        slow = slow.next;
    }

    // DELETE happens here
    slow.next = slow.next.next;

    head = dummy.next; // update head safely
}





    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.addFirst("This");
        list.addFirst("is");
        list.addLast("Java");
        list.addLast("LinkedList");
        list.print();
                list.addLast("Linked");
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();  
        list.print();
        list.reverseIterate();
        list.print();
        System.out.println(list.isPalindrome());
        Node nth = list.nthFromEnd(2);
        if (nth != null) {
            System.out.println("2nd from end: " + nth.data);
        }

        list.deleteNthFromEnd(2);
        System.out.println("After deleting 2nd from end:");
        list.print();
    }
}
