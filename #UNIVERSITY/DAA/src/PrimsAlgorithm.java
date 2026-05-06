import java.util.*;

public class PrimsAlgorithm {

    static final int V = 5; // Number of vertices

    // Function to find minimum key vertex
    int minKey(int key[], boolean mstSet[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            // Jo vertex MST me nahi hai aur sabse chhota key hai
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to print MST
    void printMST(int parent[], int graph[][]) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Prim's Algorithm Function
    void primMST(int graph[][]) {

        int parent[] = new int[V];   // MST store karega
        int key[] = new int[V];      // Minimum weight store karega
        boolean mstSet[] = new boolean[V]; // Track karega kaun include hua

        // Initialization
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE; // infinity
            mstSet[i] = false;
        }

        // Start from first node
        key[0] = 0;
        parent[0] = -1; // Root node

        // MST me V-1 edges hoti hain
        for (int count = 0; count < V - 1; count++) {

            // Minimum key wala vertex uthao
            int u = minKey(key, mstSet);

            mstSet[u] = true; // MST me add kar diya

            // Adjacent vertices update karo
            for (int v = 0; v < V; v++) {

                // Condition check:
                // 1. Edge exist karta hai
                // 2. MST me already nahi hai
                // 3. Weight current key se chhota hai
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Final MST print karo
        printMST(parent, graph);
    }

    public static void main(String[] args) {

        PrimsAlgorithm obj = new PrimsAlgorithm();

        // Graph (Adjacency Matrix)
        int graph[][] = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        obj.primMST(graph);
    }
}