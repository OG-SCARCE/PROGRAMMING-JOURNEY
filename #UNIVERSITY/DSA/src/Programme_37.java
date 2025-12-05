public class Programme_37 {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    public Programme_37() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return top.data;
    }
}
