import java.util.Scanner;
public class Challenge_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER YOUR FIRST NUMBER :");
        double num1 = input.nextDouble();

        System.out.print("ENTER YOUR SECOND NUMBER :");
        double num2 = input.nextDouble();

        System.out.print("ENTER YOUR THIRD NUMBER :");
        double num3 = input.nextDouble();

        double greatest = num1;

        if (num1<num2 && num2>num3) {
            greatest = num2;
        }
        else if (num1<num3 && num3>num2) {
            greatest = num3;
        }
        System.out.println("GREATEST NUMBER OF THESE NUMBERS WOULD BE : "+greatest);
    }
}
