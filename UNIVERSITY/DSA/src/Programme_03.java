import java.util.Scanner;

public class Programme_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int i = 0;

        char ch = 'y';
        while (ch == 'y' && i < size) {
            System.out.print("ENTER ELEMENT: ");
            arr[i] = input.nextInt();
            i++;

            if (i < size) {
                System.out.print("WANT TO ADD MORE ELEMENTS? (y/n): ");
                ch = input.next().charAt(0);
            }
        }

        System.out.println("ARRAY ELEMENTS ARE:");
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }

        input.close();
    }
}
