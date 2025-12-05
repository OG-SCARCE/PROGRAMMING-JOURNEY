public class Programme_38 {
    int[] queue;
    int front, rear, size;

    public Programme_38(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return val;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return queue[front];
    }
}
