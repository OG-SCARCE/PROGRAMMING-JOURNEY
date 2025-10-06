import java.util.Scanner;
public class Challenge_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER YOUR FIRST NUMBER :");
        int num1 = input.nextInt();

        System.out.print("ENTER YOUR SECOND NUMBER :");
        int num2 = input.nextInt();

        System.out.println("Addition : "+(num1+num2)  +"\n" +"Subtraction : "+(num1-num2) +"\n"+"Multiplication : "+(num1*num2) +"\n"+"Division : "+(num1/num2) +"\n"+"Modulo : "+(num1%num2));
    }

}
