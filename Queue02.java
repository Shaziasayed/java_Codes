
import java.util.*;

public class Queue02 {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }
        void Enqueue(int data) {
            s1.push(data);
        }
        int Dequeue() {
           if(s1.isEmpty() && s2.isEmpty()) {
            return -1;
           }
           if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
           }
           return s2.pop();
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        
    }
}

// public class Queue02{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Queue{
//         static Node head =null;
//         static Node tail=null;
//         public  void add(int data){
//             Node newNode=new Node(data);
//             if(head==null){
//                 head=tail=newNode;
//                 return;
//             }
//             tail.next=newNode;
//             tail=newNode;
//         }
//         public  int remove(){
//             if(head==null){
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front=head.data;
//             head=head.next;
//             return front;
//         }

//     }
//     public static void main(String args[]){
//         Queue q=new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
       
//     }
// }
