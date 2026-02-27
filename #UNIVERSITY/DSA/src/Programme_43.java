import java.util.Scanner;

public class Programme_43 {

    public static int sqrt(int value) {
        if (value < 0) return -1;
        if (value == 0 || value == 1) return value;

        int start = 1, end = value, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid == value) {
                return mid;
            }

            if ((long) mid * mid < value) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of which you want to find the square root : ");
        System.out.println("Square Root : " + sqrt(input.nextInt()));
    }
}
