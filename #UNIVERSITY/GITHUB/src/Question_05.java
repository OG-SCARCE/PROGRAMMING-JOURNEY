
public class Question_05 {
    static int factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    static int factorialIterative(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Recursive: " + factorialRecursive(n));
        System.out.println("Iterative: " + factorialIterative(n));
    }
}