import java.util.Scanner;
public class Challenge_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER NUMBER : ");
        int num1 = input.nextInt();

        if ((num1 & 1) == 0) {
            System.out.println("GIVEN NUMBER IS EVEN");
        }else {
            System.out.println("GIVEN NUMBER IS ODD");
        }

    }
}