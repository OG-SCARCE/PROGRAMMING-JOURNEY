import java.util.Scanner;
public class OneToN {
    //one to n
    public static void Recursion (int n){
        if (n <=0) {
            return;
        }
        Recursion(n-1);
        System.out.print(n + " ");
    }
    //n to 1
    public static void Recursion2 (int n){
        if (n <=0) {
            return;
        }
        System.out.print(n + " ");
        Recursion(n-1);
    }
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Value for n : ");
        int num = sc.nextInt();
        Recursion(num);
        Recursion2(num);
    }
}
