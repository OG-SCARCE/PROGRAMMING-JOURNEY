import java.util.Scanner;

public class Challenge_6 {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.print("PLEASE ENTER YOUR FIRST NUMBER : ");
            int num1 = input.nextInt();
            System.out.print("PLEASE ENTER YOUR SECOND NUMBER : ");
            int num2 = input.nextInt();
            System.out.print("SUM OF TWO NUMBERS : " + (num1+num2));
        }
    }
