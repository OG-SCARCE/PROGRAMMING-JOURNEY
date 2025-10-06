import java.util.Scanner;

public class Programme_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }

        int j = 0, size = num - 1;
        while (j < size) {
            int temp = arr[j];
            arr[j] = arr[size];
            arr[size] = temp;
            j++;
            size--;
        }

        System.out.println("ARRAY ELEMENTS ARE:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
