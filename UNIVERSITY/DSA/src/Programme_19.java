import java.util.Scanner;

public class Programme_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int n = input.nextInt();
        recflow(n);
    }

    public static void recflow(int num) {
        if (num == 0) {
            return;
        }
        recflowprint(num);
        recflow(num - 1);
    }

    public static void recflowprint(int num) {
        System.out.println(num);
    }
}
