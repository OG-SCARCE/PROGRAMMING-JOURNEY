public class Programme_36 {
    int[] stack;
    int top;
    int capacity;

    public Programme_36(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int element) {
        if (!isFull()) {
            stack[++top] = element;
        } else {
            System.out.println("Stack is full");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return -1;
    }
}
