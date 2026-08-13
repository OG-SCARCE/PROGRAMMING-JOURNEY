import java.util.Scanner;

public class ProductOfArray {
        public static int Recursion(int[] arr, int i){
            int product = 0;
            if (i >= arr.length) {
                return 1;
            }
            product = arr[i] * Recursion(arr, i+1);;
            return product;
        }
        static void main() {
            Scanner sc = new Scanner (System.in);
            int[] arr = {1,3,1,1,3,4,4,2,5,2};
            System.out.print(Recursion(arr, 0));
        }

}
