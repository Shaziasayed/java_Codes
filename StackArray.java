public class StackArray {
    int [ ] stack;
    int top;
    int size;
    public StackArray ( int size) {
        this.size = size;
        stack = new int [size];
        top = -1;
    }
    public void push ( int data) {
        if ( top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack [++top] = data;
    }
    public int pop ( ) {
        if ( top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack [top--]; 
    }
    public int peek ( ) {
        if ( top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack [top]; 
    }
    public void printStack ( ) {
        for ( int i = top; i >= 0; i--) {
            System.out.println(stack [i]);
        }
    }

    public static void main ( String [ ] args) {
        StackArray s = new StackArray (5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.printStack();
        System.out.println("Top element is: " + s.peek());
        System.out.println("Popped element is: " + s.pop());
        s.printStack(); 
        
        
    }
}

