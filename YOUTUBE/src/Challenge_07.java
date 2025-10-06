import java.util.Scanner;
public class Challenge_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.println("ENTER YOUR FIRST NUMBER : ");
        int num2 = input.nextInt();
        System.out.println("NUMBER 1 : "+num1);
        System.out.println("NUMBER 2 : "+num2);
        System.out.println("AFTER CONVERSION .....");
        num2=num2+num1;
        num1=num2-num1;
        num2=num2-num1;
        System.out.println("NUMBER 1 : "+num1);
        System.out.println("NUMBER 2 : "+num2);
    }
}
