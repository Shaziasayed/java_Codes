public class Circular{
        static class Queue {
             int arr[];
             int size;
             int rear = -1;
             int front = -1;
            
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }
       Boolean enqueue(int data) {
            if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return false;
        }
            if (front == -1) {
                front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
        return true;
    }
    int Dequeue{
        if(front==-1) return -1;
        int val=arr[front];
        if(front ==rear ) front =rear =-1;
        else{
            front=(front+1)%size;
        }
        return val;

    }

    public  boolean isFull() {
        return (rear + 1) % size == front;
    }
}
public static void main(String args[]) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    // while (!q.isEmpty()) {
    //     System.out.println(q.remove());
    //     }
    //}
}
}
// public class Circular {
//     static class Queue {
//         int arr[];
//         int size;
//         int rear = -1;
//         int front = -1;

//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }

//         public void add(int data) {
//             if (isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             if (front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int result = arr[front];
//             if (front == rear) { // only one element
//                 front = rear = -1;
//             } else {
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         public boolean isEmpty() {
//             return front == -1;
//         }

//         public boolean isFull() {
//             return (rear + 1) % size == front;
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.remove());
//         }
//     }
// }
