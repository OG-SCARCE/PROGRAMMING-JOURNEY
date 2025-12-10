import java.util.Scanner;
public class Programme_41 {
    //Iterative method
    public static int powIterative(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    //Recursive method
    public static int powRecursive(int a, int n) {
        if (n == 0) return 1;
        return a * powRecursive(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the base number : ");
        int a = input.nextInt();
        System.out.println("Enter power you want on that number : ");
        int n = input.nextInt();

        System.out.println(powIterative(a, n)); //Calling Iterative method
        System.out.println(powRecursive(a, n)); //Calling Recursive method
    }

}
