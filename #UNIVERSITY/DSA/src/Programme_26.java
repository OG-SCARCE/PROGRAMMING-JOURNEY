import java.util.Scanner;

public class Programme_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many arrays you want to create? ");
        int n = input.nextInt();

        int[][] arrays = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("ENTER NUMBER OF ELEMENTS FOR ARRAY " + (i + 1) + ": ");
            int num = input.nextInt();
            arrays[i] = new int[num];
            for (int j = 0; j < num; j++) {
                System.out.print("ENTER ELEMENT " + (j + 1) + ": ");
                arrays[i][j] = input.nextInt();
            }
        }

        System.out.println("All arrays entered:");
        for (int i = 0; i < n; i++) {
            System.out.print("Array " + (i + 1) + ": ");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }

        int[] sortedarray = new int[arrays[1].length + arrays[2].length];

    }
}
