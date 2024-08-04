package GraphTraversal;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Queue;

public class BFS {
	
	public static void bfs(int[][] adjMatrix, int startVertex) {
		int numVertices = adjMatrix.length;
		boolean[] visited = new boolean[numVertices];
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(startVertex);
		visited[startVertex] = true;
		
		System.out.println("BFS starting vertex is :"+startVertex);
		while(!queue.isEmpty()) {
			int vertex = queue.poll();
			System.out.print(vertex+" ");
			for(int neighbour =0;neighbour<numVertices;neighbour++) {
				if(adjMatrix[vertex][neighbour] ==1 & !visited[neighbour]) {
					queue.add(neighbour);
					visited[neighbour] = true;
				}
			}
		}
		System.out.println();
		
	}
	public static void main(String args[]) {
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
		
		bfs(adjMatrix, startVertex);
	}
}


/*
Test Case 1 :
input:
5
5
0 1
0 4
1 2
1 3
3 4
0  // vertex where to start from
output:
0 1 4 2 3

Test Case 2 :
input:
6
7
0 1
0 2
1 3
1 4
2 4
3 5
4 5
0  // vertex where to start from
output:
0 1 2 3 4 5 

*/