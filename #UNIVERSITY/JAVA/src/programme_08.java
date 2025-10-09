import java.util.Scanner;
public class programme_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("ENTER YOUR NAME: ");
            String name = input.nextLine();
            System.out.println("WELCOME, " + name);
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG!");
        } finally {
            System.out.println("PROGRAM EXECUTED (from finally block).");
        }
    }
}
