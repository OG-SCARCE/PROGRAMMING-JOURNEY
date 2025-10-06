import java.util.Scanner;
import java.util.Arrays;

public class Programme_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }
        System.out.println("YOUR ARRAY : " + Arrays.toString(arr));

        input.close();
    }
}
