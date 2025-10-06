public class Question_03 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];
        int[][] prod = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = a[i][j] + b[i][j];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    prod[i][j] += a[i][k] * b[k][j];

        System.out.println("Addition:");
        printMatrix(sum);

        System.out.println("Multiplication:");
        printMatrix(prod);
    }

    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (j < m[i].length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
