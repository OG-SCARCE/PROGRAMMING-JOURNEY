import java.util.*;

// Edge class banayi hai jo Comparable implement karti hai
// Isse hum list ko weight ke hisaab se sort kar payenge
class Edge implements Comparable<Edge> {
    String source, destination;
    int weight;

    public Edge(String source, String destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    // Sort karne ka logic (Ascending order of weight)
    @Override
    public int compareTo(Edge otherEdge) {
        return this.weight - otherEdge.weight;
    }
}

// Cycle detect karne ke liye Disjoint Set (Union-Find)
class DisjointSet {
    Map<String, String> parent = new HashMap<>();
    Map<String, Integer> rank = new HashMap<>();

    // Constructor: Shuru mein har node apna khud ka leader hai
    public DisjointSet(String[] vertices) {
        for (String v : vertices) {
            parent.put(v, v);
            rank.put(v, 0); // Sabki rank 0 hai
        }
    }

    // Find function with Path Compression
    public String find(String i) {
        if (parent.get(i).equals(i)) {
            return i;
        }
        // Path compression: recursive call
        String result = find(parent.get(i));
        parent.put(i, result);
        return result;
    }

    // Union function with Union by Rank
    public boolean union(String x, String y) {
        String rootX = find(x);
        String rootY = find(y);

        // Agar leaders alag hain, toh cycle NAHI banegi
        if (!rootX.equals(rootY)) {
            int rankX = rank.get(rootX);
            int rankY = rank.get(rootY);

            // Chote tree ko bade tree ke neeche lagao
            if (rankX < rankY) {
                parent.put(rootX, rootY);
            } else if (rankX > rankY) {
                parent.put(rootY, rootX);
            } else {
                parent.put(rootY, rootX);
                rank.put(rootX, rankX + 1);
            }
            return true; // Edge successful
        }
        return false; // Cycle banegi, edge reject
    }
}

public class KruskalAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kruskal's MST Algorithm (Java) ===");

        // 1. Vertices input lena
        System.out.print("Apne vertices space se separate karke daalo (e.g., A B C D): ");
        String verticesInput = scanner.nextLine();
        String[] vertices = verticesInput.split(" ");

        // 2. Edges input lena
        System.out.print("Total number of edges kitne hain?: ");
        int eCount = scanner.nextInt();
        scanner.nextLine(); // newline character ko consume karne ke liye

        List<Edge> edges = new ArrayList<>();

        System.out.println("\nAb apni edges daalo is format mein -> Node1 Node2 Weight (e.g., A B 4)");

        for (int i = 0; i < eCount; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            String u = scanner.next();
            String v = scanner.next();
            int weight = scanner.nextInt();
            edges.add(new Edge(u, v, weight));
        }

        // 3. Edges ko weight ke hisaab se sort karna (Greedy Approach)
        Collections.sort(edges);

        // 4. Kruskal's Algorithm chalana
        DisjointSet ds = new DisjointSet(vertices);
        List<Edge> mst = new ArrayList<>();
        int totalCost = 0;

        System.out.println("\nCalculating Minimum Spanning Tree...\n");

        for (Edge edge : edges) {
            // Check cycle aur agar valid hai toh MST mein add karo
            if (ds.union(edge.source, edge.destination)) {
                mst.add(edge);
                totalCost += edge.weight;
            }

            // Optimization: MST mein (Vertices - 1) edges hoti hain
            if (mst.size() == vertices.length - 1) {
                break;
            }
        }

        // 5. Result print karna
        System.out.println("--- Edges in Minimum Spanning Tree ---");
        for (Edge edge : mst) {
            System.out.println(edge.source + " -- " + edge.destination + " == " + edge.weight);
        }
        System.out.println("Total Cost of MST: " + totalCost);

        scanner.close();
    }
}