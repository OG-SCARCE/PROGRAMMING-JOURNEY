import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 10];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        printArray(arr, n);

        System.out.print("Enter element to insert: ");
        int elem = sc.nextInt();
        System.out.print("Enter position to insert (0-indexed): ");
        int pos = sc.nextInt();
        for (int i = n; i > pos; i--) arr[i] = arr[i - 1];
        arr[pos] = elem;
        n++;
        printArray(arr, n);

        System.out.print("Enter position to delete (0-indexed): ");
        int delPos = sc.nextInt();
        for (int i = delPos; i < n - 1; i++) arr[i] = arr[i + 1];
        n--;
        printArray(arr, n);
    }

    static void printArray(int[] arr, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
