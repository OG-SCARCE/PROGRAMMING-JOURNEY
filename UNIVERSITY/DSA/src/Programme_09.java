import java.util.Scanner;
import java.util.Arrays;

public class Programme_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];
        int[] newarr = new int[num-1];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }
        System.out.println("YOUR ARRAY BEFORE REMOVING THE LAST ELEMENT : " + Arrays.toString(arr));

        for (int i = 0; i < num-1; i++) {
            newarr[i] = arr[i];
        }
        System.out.println("YOUR ARRAY AFTER REMOVING THE LAST ELEMENT : " + Arrays.toString(newarr));
        input.close();
    }
}
