import java.util.Scanner;
public class Challenge_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER MARKS (OUT OF 100) :");
        double num1 = input.nextDouble();

        if ((num1)>90)  {
            System.out.println("YOUR GRADE : A");
        }
        else if ((num1)>75)  {
            System.out.println("YOUR GRADE : B");
        }
        else if ((num1)>60)  {
            System.out.println("YOUR GRADE : C");
        }
        else if ((num1)>30)  {
            System.out.println("YOUR GRADE : D");
        }
        else if ((num1)<30)  {
            System.out.println("YOUR GRADE : F");
        }
    }
}