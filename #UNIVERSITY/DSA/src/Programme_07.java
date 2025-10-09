import java.util.Arrays;
import java.util.Scanner;

public class Programme_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }

        System.out.println("ENTER THE ELEMENT YOU WANT TO ENTER :");
        int elt = input.nextInt();

        System.out.println("ENTER THE INDEX AT WHICH YOU WANT TO ENTER THIS ELEMENT:");
        int index = input.nextInt();

        int[] newarr = new int[num+1];
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        newarr[index] = elt;

        for (int i = index+1; i < num+1; i++) {
            newarr[i] = arr[i-1];
        }

        System.out.println("YOUR ARRAY BEFORE: " + Arrays.toString(arr));
        System.out.println("YOUR ARRAY AFTER: " + Arrays.toString(newarr));
        input.close();
    }
}
