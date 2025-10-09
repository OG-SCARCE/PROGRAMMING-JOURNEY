import java.util.Scanner;
import java.util.Arrays;
public class Programme_22 {
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

        System.out.print("ENTER FIRST NUMBER YOU WANT TO FIND: ");
        int find1 = input.nextInt();

        System.out.print("ENTER FIRST NUMBER YOU WANT TO FIND: ");
        int find2 = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==find1) {
                System.out.println("FIRST NUMBER FOUND !");
            }
            if (arr[i]==find2) {
                System.out.println("SECOND NUMBER FOUND !");
            }
        }
        input.close();
    }
}