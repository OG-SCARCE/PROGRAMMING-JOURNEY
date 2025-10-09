import java.util.Scanner;
public class programme_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES YOU WANT IN THE PATTERN :");
        int  n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("========================================================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("========================================================");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("========================================================");
    }
}
