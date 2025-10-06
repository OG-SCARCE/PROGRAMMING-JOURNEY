import java.util.*;

public class Programme_24  {
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
        int x = input.nextInt();

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        if (first == -1) {
            System.out.println("NUMBER NOT FOUND !!");
        } else {
            System.out.println("FIRST OCCURRENCE : " + first);
            System.out.println("LAST OCCURRENCE : " + last);
        }

        input.close();
    }
    public static int firstOccurrence(int[] arr, int x) {
        int start = 0, end = arr.length - 1, ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }


    public static int lastOccurrence(int[] arr, int x) {
        int start = 0, end = arr.length - 1, ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
