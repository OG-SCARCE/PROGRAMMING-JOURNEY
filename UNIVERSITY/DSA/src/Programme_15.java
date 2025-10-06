import java.util.Scanner;

public class Programme_15 {

    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF WHICH YOU WANT THE FACTORIAL : ");
        int num = input.nextInt();

        try {
            System.out.println("FACTORIAL : " + factorial(num));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
