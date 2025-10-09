import java.util.Scanner;

class LowAmountException extends Exception {
    public LowAmountException(String message) {
        super(message);
    }
}
public class programme_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER FIRST SALARY : ");
        int num = input.nextInt();

        try {
            if (num < 10000) {
                throw new LowAmountException("ERROR: YOUR AMOUNT IS LOW !");
            } else {
                System.out.println("SALARY ACCEPTED: " + num);
            }
        } catch (LowAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
