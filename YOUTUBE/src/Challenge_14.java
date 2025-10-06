import java.util.Scanner;
public class Challenge_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER TEMPERATURE (IN FAHRENHEIT) :");
        double num1 = input.nextDouble();

        System.out.println("TEMPERATURE IN CELSIUS FROM THE GIVEN DATA WOULD BE : "+((num1-32)*5/9));
    }
}