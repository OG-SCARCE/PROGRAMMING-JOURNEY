import java.util.Scanner;
import java.util.Arrays;
public class Programme_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("YOUR SORTED ARRAY : " + Arrays.toString(arr));

        System.out.print("ENTER NUMBER YOU WANT TO FIND: ");
        int find1 = input.nextInt();

        search(find1, arr);

        input.close();
    }

    public static void search(int num, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == num) {
                System.out.println("NUMBER FOUND at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("NUMBER NOT FOUND !!");
        }
    }
}
