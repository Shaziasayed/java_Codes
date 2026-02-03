import java.util.*;
public class MergekLists  {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node merge (Node [] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeRange(lists, 0, lists.length - 1);
    }
    public Node mergeRange(Node[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        int mid = l + (r - l) / 2;
        Node left = mergeRange(lists, l, mid);
        Node right = mergeRange(lists, mid + 1, r);
        return mergetwolists(left, right);
    }
    public Node mergetwolists(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if(list1.data<list2.data){
            list1.next=mergetwolists(list1.next,list2);
            return list1;
        } else {
            list2.next=mergetwolists(list1,list2.next);
            return list2;
        }
        

    }
    public static void main(String[] args) {
        
        MergekLists list=new MergekLists();
        Node[] lists = new Node[3];

        lists[0] = list.new Node(1);
        lists[0].next = list.new Node(4);
        lists[0].next.next = list.new Node(5);

        lists[1] = list.new Node(1);
        lists[1].next = list.new Node(3);
        lists[1].next.next = list.new Node(4);

        lists[2] = list.new Node(2);
        lists[2].next = list.new Node(6);

        Node mergedHead = list.merge(lists);

        // Print merged linked list
        Node current = mergedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

            

        
    
}