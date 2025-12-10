import java.util.Scanner;
public class Programme_42 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int c = 0;
        int n = input.nextInt();
        while (n > 0) {
            n /= 5;
            c += n;
        }
        System.out.println(c);
    }
}