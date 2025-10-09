import java.util.Scanner;

public class Programme_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = num - 1; i >= 0; i--) {
            sum += arr[i];
        }

        System.out.println("SUM OF ALL THE ELEMENTS OF AN ARRAY : " + sum);

        input.close();
    }
}
