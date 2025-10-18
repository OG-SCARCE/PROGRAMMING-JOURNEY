import java.util.Scanner;

// 1. Create the base exception class
class ATMException extends Exception {
    public ATMException(String message) {
        super(message);
    }
}

// 2. Create a subclass for invalid PIN errors
class InvalidPINException extends ATMException {
    public InvalidPINException(String message) {
        super(message);
    }
}

// 3. Create a subclass for insufficient balance errors
class InsufficientBalanceException extends ATMException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class programme_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pre-defined account details for the simulation
        int correctPin = 1234;
        double balance = 1000.0;

        // Read user input
        int enteredPin = sc.nextInt();
        double withdrawAmount = sc.nextDouble();

        try {
            // Validate the PIN
            if (enteredPin != correctPin) {
                throw new InvalidPINException("Invalid PIN!");
            }

            // Validate the balance
            if (withdrawAmount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            // If all validations pass, process the withdrawal
            balance -= withdrawAmount;
            System.out.println("Balance after withdrawal: " + balance);

        } catch (ATMException e) {
            // Catch the base exception to handle both specific errors
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}