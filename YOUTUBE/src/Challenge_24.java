import java.util.Scanner;
public class Challenge_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER NUMBER : ");
        int num1 = input.nextInt();

        if ((num1 & 1)==1) {
            System.out.println("YOUR GIVEN NUMBER IS : ODD");
        }
        else {
            System.out.println("YOUR GIVEN NUMBER IS : EVEN");
        }
    }
}