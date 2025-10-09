import java.util.Scanner;
public class Challenge_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER YEAR :");
        double num1 = input.nextDouble();

        if ((num1%4==0 && num1%100!=0) || num1%400==0)  {
            System.out.println("YEAR FROM THE GIVEN DATA WOULD BE : LEAP");
        }
        else {
            System.out.println("YEAR FROM THE GIVEN DATA WOULD BE : NOT LEAP");
        }
    }
}