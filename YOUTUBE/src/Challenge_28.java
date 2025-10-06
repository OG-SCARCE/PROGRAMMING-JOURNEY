import java.util.Scanner;
public class Challenge_28{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER OF WHICH OF YOU WANT THE TABLE : ");
        multiplication(input.nextInt());
    }

    public static void multiplication(int num) {
        int i = 1;
        while (i <= 10){
            System.out.println(i+" X "+num+" : "+(num*i));
            i++;
        }
    }
}
