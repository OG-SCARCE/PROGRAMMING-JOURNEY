import java.util.Scanner;

public class Programme_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("ENTER " + (i + 1) + "th ELEMENT : ");
            arr[i] = input.nextInt();
        }
        int n = arr.length;

        System.out.println("MID ELEMENT : " + arr[(arr.length/2)-1]);

        input.close();
    }
}
