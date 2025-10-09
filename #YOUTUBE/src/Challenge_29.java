import java.util.Scanner;
public class Challenge_29{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER THE NUMBER TILL OF WHICH OF YOU WANT THE SUM OF ALL ODD NUMBERS : ");
        System.out.println("SUM : "+sumallodd(input.nextInt()));
    }
    public static int sumallodd(int num) {
        int sum = 0;
        while (num > 0) {
            if (num % 2 != 0){
                sum +=num;
            }
            num--;
        }
        return sum;
    }
}
