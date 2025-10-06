import java.util.Scanner;
public class Challenge_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER YOUR FIRST NUMBER :");
        double num1 = input.nextDouble();

        System.out.print("ENTER YOUR SECOND NUMBER :");
        double num2 = input.nextDouble();

        System.out.println("DIVISION OF THESE TWO DECIMAL WOULD BE : "+(num1/num2));
    }
}
