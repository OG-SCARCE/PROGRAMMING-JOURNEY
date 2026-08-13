import java.util.*;
public class MinAndMax {
    static int[] array = {Integer.MAX_VALUE,Integer.MIN_VALUE};

    public static int[] Recursion(int[] arr, int i){
        if (i >= arr.length) {
            return new int[]{0};
        }
        array[0] = Math.min(array[0],arr[i]);
        array[1] = Math.max(array[1],arr[i]);

        Recursion(arr,i+1);
        return array;
    }
    static void main() {
        Scanner sc = new Scanner (System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Minimum Element : "+Recursion(arr, 0)[0]+ "\nMaximum Element :" + Recursion(arr, 0)[1]);
    }
}
