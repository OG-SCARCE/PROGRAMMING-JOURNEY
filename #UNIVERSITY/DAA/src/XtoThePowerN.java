import java.util.Scanner;

public class XtoThePowerN {
    static int solution = 1;
    public static int power(int x, int n){
        if(n < 1){
            return 1;
        }
        solution = solution * x;
        power(x, n-1);
        return solution;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value For Base Number : ");
        int x = sc.nextInt();
        System.out.print("Enter The Value For Power : ");
        int n = sc.nextInt();
        System.out.print(power(x,n));

    }
}
