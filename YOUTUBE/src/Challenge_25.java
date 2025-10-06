import java.util.Scanner;
public class Challenge_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER NUMBER : ");
        int num1 = input.nextInt();

        System.out.println("BITWISE 'LEFT SHIFT BY 1' : "+ (num1<<1));
    }
}