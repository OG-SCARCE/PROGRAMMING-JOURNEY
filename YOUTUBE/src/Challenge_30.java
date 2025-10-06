import java.util.Scanner;
public class Challenge_30{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        System.out.println("FACTORIAL : "+factorial(input.nextInt()));
    }
    public static int factorial (int num){
        if(num < 2){
            return 1;
        }
        return num*factorial(num-1);
    }
}
