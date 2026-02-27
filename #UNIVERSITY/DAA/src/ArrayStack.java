import java.util.Scanner;

public class ArrayStack {

    static int[] stack;
    static int top = -1;
    static int capacity;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        capacity = sc.nextInt();

        stack = new int[capacity];

        while (true) {

            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: ");
                int value = sc.nextInt();

                if (top == capacity - 1) {
                    System.out.println("Stack Overflow");
                } else {
                    stack[++top] = value;
                    System.out.println(value + " pushed");
                }

            } else if (choice == 2) {

                if (top == -1) {
                    System.out.println("Stack Underflow");
                } else {
                    System.out.println(stack[top--] + " popped");
                }

            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println("Current Stack:");
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                for (int i = top; i >= 0; i--)
                    System.out.println(stack[i]);
            }
        }

        sc.close();
    }
}