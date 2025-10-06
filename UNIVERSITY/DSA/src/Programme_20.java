import java.util.Scanner;

public class Programme_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR NUMBER : ");
        int n = input.nextInt();

        System.out.println("\nForward Print:");
        numprintforward(n);

        System.out.println("\nBackward Print:");
        numprintbackward(n);

        input.close();
    }
//tail recursion
    public static void numprintforward(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        numprintforward(num - 1);
    }
//head recursion
    public static void numprintbackward(int num) {
        if (num == 0) {
            return;
        }
        numprintbackward(num - 1);
        System.out.println(num);
    }
}
