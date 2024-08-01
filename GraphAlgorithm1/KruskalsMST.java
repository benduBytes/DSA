package GraphAlgorithm1;

import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class KruskalsMST {

    private int V;
    private List<Edge> edges;

    public KruskalsMST(int V) {
        this.V = V;
        edges = new ArrayList<>();
    }

    public void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(src, dest, weight);
        edges.add(edge);
    }

    private int find(int[] parent, int v) {
        if (parent[v] != v) {
            parent[v] = find(parent, parent[v]);
        }
        return parent[v];
    }

    private void union(int[] parent, int[] rank, int u, int v) {
        int rootU = find(parent, u);
        int rootV = find(parent, v);

        if (rank[rootU] < rank[rootV]) {
            parent[rootU] = rootV;
        } else if (rank[rootU] > rank[rootV]) {
            parent[rootV] = rootU;
        } else {
            parent[rootV] = rootU;
            rank[rootU]++;
        }
    }

    public List<Edge> kruskal() {
        List<Edge> mst = new ArrayList<>();
        Collections.sort(edges);
        int[] parent = new int[V];
        int[] rank = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        int e = 0;
        int i = 0;
        while (i < V - 1 && e < edges.size()) {
            Edge next = edges.get(e++);
            int x = find(parent, next.src);
            int y = find(parent, next.dest);
            if (x != y) {
                mst.add(next);
                union(parent, rank, x, y);
                i++;
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();
        KruskalsMST k = new KruskalsMST(n);

        System.out.println("Enter the adjacency matrix:");
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
                if (i < j && graph[i][j] != 0) { // Only add edges once for undirected graph
                    k.addEdge(i, j, graph[i][j]);
                }
            }
        }

        List<Edge> mst = k.kruskal();

        System.out.println("Edges of MST:");
        for (Edge e : mst) {
            System.out.println((e.src + 1) + " -> " + (e.dest + 1)+ " -> " + graph[e.src][e.dest]);
        }
        sc.close();
    }
}

/*
Test Case 1 :
input:
3
0 10 20
10 0 15
20 15 0
output:
1 -> 2
2 -> 3

Test Case 2 :
input:
4
0 10 20 30
10 0 15 25
20 15 0 35
30 25 35 0
output:
1 -> 2
2 -> 3
2 -> 4

Test Case 3 :
input:
6
0 4 3 0 0 0
4 0 1 2 0 0
3 1 0 4 0 0
0 2 4 0 2 0
0 0 0 2 0 6
0 0 0 0 6 0
output:
2 -> 3
2 -> 4
4 -> 5
1 -> 3
5 -> 6
*/