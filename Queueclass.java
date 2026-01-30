public class Queueclass{
static class Queue {
    static int arr[];
    static int size;
    int font=0;
    static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
            }

        public static boolean isEmpty() {
                return rear == -1;
                }


        public static void add(int data) {
            if (rear == size - 1) {
                return;
               }

        arr[++rear] = data;
        }
        int Deque() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[font++];
}
        int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[font];
}
public static void main(String args[]) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    while (!q.isEmpty()) {
        System.out.println(q.remove());
        }
    }
}
