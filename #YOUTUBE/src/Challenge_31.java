import java.util.Scanner;
public class Challenge_31{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        System.out.println("SUM OF DIGITS : "+sumofdigits(input.nextInt()));
    }
    public static int sumofdigits(int num){
        int sum = 0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }
}
