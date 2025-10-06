import java.util.Scanner;
public class programme_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER FIRST NUMBER : ");
        float num1 = input.nextFloat();

        System.out.print("ENTER SECOND NUMBER : ");
        float num2 = input.nextFloat();

        try {
            if (num2 == 0) {
                throw new ArithmeticException("SECOND NUMBER CANNOT BE ZERO");
            }
            System.out.println("ON DIVIDING FIRST NUMBER BY SECOND NUMBER : " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
