import java.util.Scanner;
public class Challenge_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER NUMBER :");
        double num1 = input.nextDouble();

        if (num1<0) {
            System.out.println("NUMBER FROM THE GIVEN DATA WOULD BE : NEGATIVE");
        }
        else if (num1>0) {
            System.out.println("NUMBER FROM THE GIVEN DATA WOULD BE : POSITIVE");
        }
        else {
            System.out.println("NUMBER FROM THE GIVEN DATA WOULD BE : ZERO");
        }

    }
}