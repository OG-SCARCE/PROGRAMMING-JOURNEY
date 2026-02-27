import java.util.Scanner;

public class Programme_44 {

    public static String multiply(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int digit1 = a.charAt(i) - '0';
                int digit2 = b.charAt(j) - '0';

                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        String ans = "";
        int i = 0;
        while (i < result.length && result[i] == 0) i++;

        while (i < result.length) {
            ans += result[i];
            i++;
        }

        return ans.equals("") ? "0" : ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        String a = input.nextLine();

        System.out.println("Enter second number : ");
        String b = input.nextLine();

        System.out.println("Result : " + multiply(a, b));
    }
}
