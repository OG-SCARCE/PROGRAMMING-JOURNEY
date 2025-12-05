import java.util.*;

public class Programme_35 {
    private List<List<Integer>> adj;

    public Programme_35(int n) {
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int x : adj.get(start)) {
            if (!visited[x]) dfs(x, visited);
        }
    }

    public static void main(String[] args) {

        Programme_35 g = new Programme_35(13);

        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 5);

        g.addEdge(4, 6);
        g.addEdge(4, 7);

        g.addEdge(3, 9);
        g.addEdge(9, 10);

        g.addEdge(2, 8);
        g.addEdge(5, 8);

        g.addEdge(8, 11);
        g.addEdge(11, 12);

        boolean[] visited = new boolean[13];

        System.out.println("DFS Traversal starting from node 1:");
        g.dfs(1, visited);
    }
}
