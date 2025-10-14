import java.util.Scanner;

public class Programme_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }
        input.close();
        sort(arr);
        System.out.println("SORTED ARRAY : ");
        for (int x : arr) System.out.print(x + " ");
    }

    public static void sort(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (arr[i] != 1) {
            i++;
        }
        while (arr[j] != 1) {
            j++;
        }
        swap(arr,i,j);
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
