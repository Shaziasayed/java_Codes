import java.util.Stack;
public class MinStack {
    public static class  Min(){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }
        void pop() {
            if (stack.isEmpty()) return;
            int top = stack.pop();
            if (top == minStack.peek()) {
                minStack.pop();
            }
        }
        int getMin(){
            return minStack.peek();
        }
        // stack.push(5);
        // minStack.push(5);
        
        // stack.push(3);
        // minStack.push(3);
        
        // stack.push(7);

        // stack.pop();
        // minStack.pop();
        // System.out.println( minStack.peek());
      
    }    public static void main(String[] args) {
        Min minStack = new Min();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        System.out.println(minStack.getMin()); // Should print 3
        minStack.pop();
        System.out.println(minStack.getMin()); // Should print 5
    }
}
