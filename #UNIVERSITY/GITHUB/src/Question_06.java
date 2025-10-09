
public class Question_06 {
    static void fibIterative(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        fibIterative(n);
        for (int i = 0; i < n; i++)
            System.out.print(fibRecursive(i)+"");
    }
}