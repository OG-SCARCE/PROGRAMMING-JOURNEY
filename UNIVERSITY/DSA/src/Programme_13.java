import java.util.Scanner;
import java.util.Arrays;

public class Programme_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ROWS (MAIN ARRAY SIZE): ");
        int rows = input.nextInt();

        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("ENTER NUMBER OF COLUMNS FOR ROW " + i + " : ");
            int cols = input.nextInt();
            arr[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                System.out.print("ENTER ELEMENT FOR arr[" + i + "][" + j + "] : ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("YOUR ARRAY : " + Arrays.deepToString(arr));
        input.close();

        // sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("SUM : " + sum);

        // max and min
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("MINIMUM VALUE : " + min);
        System.out.println("MAXIMUM VALUE : " + max);

        // even odd
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("NUMBER OF ODD NUMBERS : " + odd);
        System.out.println("NUMBER OF EVEN NUMBERS : " + even);
    }
}
