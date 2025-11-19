public class Programme_32 {
    static class Node {
        int c;
        int exp;
        Node next;

        Node(int c, int exp) {
            this.c = c;
            this.exp = exp;
            this.next = null;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.c + "x^" + temp.exp);
            if (temp.next != null)
                System.out.print(" + ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(5, 2);
        Node b = new Node(3, 1);
        Node c = new Node(2, 0);

        a.next = b;
        b.next = c;

        System.out.print("Polynomial: ");
        display(a);
    }
}
