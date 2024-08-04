package GraphTraversal;
import java.util.*;

public class DFS {
	
	public static void dfs(int[][] adjMatrix, boolean visited[],int vertex) {
		int numVertices = adjMatrix.length;
		visited[vertex] = true;
		System.out.print(vertex+" ");
		
		for(int i =0;i<numVertices;i++) {
			if(adjMatrix[vertex][i] == 1 && !visited[i]) {
				dfs(adjMatrix,visited,i);
			}
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n - dimension
		int numVertices = sc.nextInt();
		int adjMatrix[][] = new int[n][n];
		
		for(int i =0;i<numVertices;i++) {
			int src = sc.nextInt();
			int des = sc.nextInt();
			adjMatrix[src][des] = 1;
		}
		int startVertex = sc.nextInt();
		boolean visited[] = new boolean[n];
		System.out.print("visited vertex : ");
		dfs(adjMatrix, visited, startVertex);
	}
}

/*
Test Case 1 :
input:
8
20
0 1
0 2
0 3
0 4
1 0
1 5
2 0
2 5
3 0
3 6
4 0
4 6
5 1
5 2
5 7
6 3
6 4
6 7
7 5
7 6
0
output:
visited vertex : 0 1 5 2 7 6 3 4

*/
