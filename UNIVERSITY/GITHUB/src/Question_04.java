public class Question_04 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 99, 3, 5};
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max: " + max + ", Min: "+min);
    }
}