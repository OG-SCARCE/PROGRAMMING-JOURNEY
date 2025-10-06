import java.util.Scanner;
public class Challenge_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER FIRST NUMBER : ");
        int num1 = input.nextInt();

        System.out.print("ENTER SECOND NUMBER : ");
        int num2 = input.nextInt();

        System.out.println("BITWISE 'AND' : "+(num1 & num2));
    }
}