import java.util.Scanner;
public class Addfirstlinkedlist {
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
    public void printList() {
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
         System.out.print(currNode.data + " -> ");
        System.out.println("null");
    }

    public static void main(String[] args){
        Addfirstlinkedlist list=new Addfirstlinkedlist();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements to add at first:");
        int n=sc.nextInt();
        sc.nextLine(); // Consume the newline character
        for(int i=0;i<n;i++){
            System.out.println("Enter Data:");
            String data=sc.nextLine();

            list.addFirst(data);
        }
        list.printList();

    }
}
