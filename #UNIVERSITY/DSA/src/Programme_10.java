import java.util.Arrays;
import java.util.Scanner;

public class Programme_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }

        System.out.println("ENTER THE ELEMENT YOU WANT TO REMOVE :");
        int elt = input.nextInt();
        
        int index = -1;
        for (int i = 0; i < num; i++) {
            if (arr[i] == elt) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("ELEMENT NOT FOUND!");
        } else {
            int[] newarr = new int[num - 1];
            for (int i = 0; i < index; i++) {
                newarr[i] = arr[i];
            }
            for (int i = index; i < num - 1; i++) {
                newarr[i] = arr[i + 1];
            }

            System.out.println("YOUR ARRAY BEFORE: " + Arrays.toString(arr));
            System.out.println("YOUR ARRAY AFTER: " + Arrays.toString(newarr));
        }

        input.close();
    }
}