import java.util.Scanner;
public class Challenge_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER YOUR BASE LENGTH (IN CMS):");
        double num1 = input.nextDouble();

        System.out.print("ENTER YOUR HEIGHT LENGTH (IN CMS):");
        double num2 = input.nextDouble();

        System.out.println("AREA OF TRIANGLE FROM THE GIVEN DATA WOULD BE (IN CMS): "+(0.5*num1*num2));
    }
}