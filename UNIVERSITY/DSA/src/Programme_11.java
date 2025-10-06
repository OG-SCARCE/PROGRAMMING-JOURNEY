import java.util.Scanner;
import java.util.Arrays;

public class Programme_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ROWS (MAIN ARRAY SIZE): ");
        int rows = input.nextInt();

        System.out.print("ENTER NUMBER OF COLUMNS (SUB ARRAY SIZE): ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("ENTER ELEMENT FOR arr[" + i + "][" + j + "] : ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("YOUR ARRAY : " + Arrays.deepToString(arr));

        input.close();
    }
}
