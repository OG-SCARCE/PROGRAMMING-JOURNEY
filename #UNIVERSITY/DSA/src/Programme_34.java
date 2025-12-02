import java.util.ArrayList;
import java.util.List;

public class Programme_34 {

    private final List<List<Integer>> adj;

    public Programme_34(int n) {
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v, boolean undirected) {
        adj.get(u).add(v);
        if (undirected) adj.get(v).add(u);
    }

    public List<Integer> neighbors(int v) {
        return adj.get(v);
    }

    public void printAdjList() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            List<Integer> list = adj.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
                if (j < list.size() - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 6;
        int[][] edges = {
                {0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4}, {4, 5}
        };

        Programme_34 g = new Programme_34(n);

        for (int[] e : edges) g.addEdge(e[0], e[1], true);

        g.printAdjList();
    }
}
