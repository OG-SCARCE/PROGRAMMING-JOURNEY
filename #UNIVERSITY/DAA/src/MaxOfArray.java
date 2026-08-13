import java.util.*;

public class MaxOfArray {
    int i = 0;
    static int max = 0;
    public static int Recursion(int[] arr, int i){
        if (i >= arr.length) {
            return Integer.MIN_VALUE;
        }
        max = Math.max(max,arr[i]);
        Recursion(arr,i+1);
        return max;

    }
    static void main() {
        Scanner sc = new Scanner (System.in);
        int[] arr = {1,3,1,1,3,4,4,2,5,2};
        System.out.print(Recursion(arr, 0));
    }

}
