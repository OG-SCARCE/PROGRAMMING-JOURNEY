import java.util.Scanner;
public class Challenge_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER AGE : ");
        double num1 = input.nextDouble();

        if ((num1)>60)  {
            System.out.println("YOUR AGE GROUP : SENIOR");
        }
        else if ((num1)<60 && (num1)>=20 )  {
            System.out.println("YOUR AGE GROUP : ADULT");
        }
        else if ((num1)<20 && (num1)>13)  {
            System.out.println("YOUR AGE GROUP : TEEN");
        }
        else if ((num1)<13)  {
            System.out.println("YOUR AGE GROUP : CHILD");
        }
    }
}