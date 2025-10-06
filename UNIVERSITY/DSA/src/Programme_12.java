import java.util.Scanner;
import java.util.Arrays;

public class Programme_12 {
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

        //sum
        int count = 0;

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                count += arr[i][j];
            }
        }
        System.out.println("SUM : "+count);

        //max and min

        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                if (arr[i][j]<min) {
                    min = arr[i][j];
                }
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("MINIMUM VALUE :"+ min);
        System.out.println("MAXIMUM VALUE :"+ max);

        //even odd
        int even = 0;
        int odd = 0;

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                if (arr[i][j] % 2 == 0){
                    even += 1;
                }else{
                    odd+=1;
                }
            }
        }
        System.out.println("NUMBER OF ODD NUMBERS : "+odd);
        System.out.println("NUMBER OF EVEN NUMBERS : "+even);
    }
}
