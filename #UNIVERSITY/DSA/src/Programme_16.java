import java.util.Scanner;
public class Programme_16 {
    public static int fibonacci(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers");
        }
        if (num == 0 ) {
            return 0;
        }
        if ( num == 1) {
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF WHICH YOU WANT THE FIBONACCI : ");
        int num = input.nextInt();

        try {
            System.out.println("FIBONACCI : " + fibonacci(num));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
