package GraphAlgorithm1;
import java.util.*;

public class PrimsMST {
	int minKey(int[] key, boolean[] mstSet) {
		int min = Integer.MAX_VALUE, minIndex = -1;
		int V = key.length;
		for(int v=0;v<V;v++) {
			if(!mstSet[v] && key[v]<min) {
				min = key[v];
				minIndex = v;
			}
		}
		return minIndex;
	}
	void printMST(int[] parent, int[][] graph,int key[]) {
		System.out.println("Edge weigth");
		int V = graph.length;
		for(int i =1;i<V;i++) {
			System.out.println(parent[i]+1+ "--> " + (i+1)+" --> "+key[i]);
		}
	}
	void primMST(int[][] graph) {
		int V = graph.length;
		int[] parent = new int[V];
		int[] key = new int[V];
		boolean[] mstSet = new boolean[V];
		Arrays.fill(key, Integer.MAX_VALUE);
		Arrays.fill(parent, -1);
		key[0] = 0;
		for(int count =0;count<V-1;count++) {
			int u = minKey(key,mstSet);
			mstSet[u] = true;
			
			for(int v =0; v<V;v++) {
				if(graph[u][v] != 0 && !mstSet[v] && graph[u][v]<key[v]) {
					parent[v] = u;
					key[v] = graph[u][v];
				}   
			}
		}
		printMST(parent,graph,key);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimsMST mst = new PrimsMST();
		int n = sc.nextInt();
		int graph[][] = new int[n][n];
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		mst.primMST(graph);
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
*/