import java.util.Scanner;
public class Challenge_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER PRINCIPLE :");
        double num1 = input.nextDouble();

        System.out.print("ENTER RATE:");
        double num2 = input.nextDouble();

        System.out.print("ENTER TIME:");
        double num3 = input.nextDouble();

        System.out.println("COMPOUND INTEREST FROM THE GIVEN DATA WOULD BE : "+(num1*((1+num2)/100)*num3));
    }
}
