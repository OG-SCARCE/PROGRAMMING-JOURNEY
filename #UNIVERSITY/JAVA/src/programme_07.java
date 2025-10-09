import java.util.Scanner;

public class programme_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER : ");
        int num1 = input.nextInt();


        System.out.print("ENTER SECOND NUMBER : ");
        int num2 = input.nextInt();

        int[] arr = {10, 20, 30};

        try {
            int result = num1 / num2;
            System.out.println("RESULT : " + result);
        }catch (ArithmeticException e) {
            System.out.println("ERROR: Division by zero is not allowed!");
        }
        try {
            System.out.println("ACCESSING ARRAY INDEX 5 : " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Array index is out of range!");
        }
    }
}
