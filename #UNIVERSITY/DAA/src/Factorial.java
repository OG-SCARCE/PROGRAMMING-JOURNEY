import java.util.*;
public class Factorial {
    public static int factorial(int num){
        if(num <= 1 ){
            return 1;
        }
        return num * factorial(num -1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value to Find Factorial : ");
        System.out.print(factorial(sc.nextInt()));
    }
}
