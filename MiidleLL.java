public class MiidleLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

 
    public static Node middleNode(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; 
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);

        Node middle = middleNode(head);

        if (middle != null) {
            System.out.println("Middle node value: " + middle.data);
        } else {
            System.out.println("Linked list is empty");
        }
    }
}
