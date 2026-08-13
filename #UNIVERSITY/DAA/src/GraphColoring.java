import java.util.Scanner;

class GraphColoring {

    int n, m;
    int[][] graph;
    int[] color;

    void nextColor(int k) {

        while (true) {

            color[k] = (color[k] + 1) % (m + 1);

            if (color[k] == 0)
                return;

            int i;

            for (i = 0; i < n; i++) {

                if (graph[k][i] == 1 && color[k] == color[i])
                    break;
            }

            if (i == n)
                return;
        }
    }

    void mColoring(int k) {

        while (true) {

            nextColor(k);

            if (color[k] == 0)
                return;

            if (k == n - 1) {

                for (int i = 0; i < n; i++)
                    System.out.print(color[i] + " ");

                System.out.println();
            }

            else
                mColoring(k + 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GraphColoring g = new GraphColoring();

        System.out.print("Enter number of vertices: ");
        g.n = sc.nextInt();

        System.out.print("Enter number of colors: ");
        g.m = sc.nextInt();

        g.graph = new int[g.n][g.n];
        g.color = new int[g.n];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < g.n; i++) {

            for (int j = 0; j < g.n; j++) {

                g.graph[i][j] = sc.nextInt();
            }
        }

        System.out.println("Possible colorings:");

        g.mColoring(0);
    }
}