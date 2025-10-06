import java.util.Scanner;

public class Programme_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR NUMBER : ");
        int n = input.nextInt();

        int result = addnumbers(n);
        System.out.println("SUM = " + result);
        input.close();
    }
    public static int addnumbers(int num) {
        return acc(num,1);
        }
    public static int acc(int num, int a) {
        if (num == 0) {
            return a;
        }
        return acc(num-1,num+a);
    }
}
