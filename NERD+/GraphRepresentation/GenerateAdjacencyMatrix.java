package GraphRepresentation;
import java.util.*;

class Graph{
	int nofvertices;
	int adjMatrix[][];
	
	Graph(int nofvertices){
		this.nofvertices = nofvertices;
		adjMatrix = new int[nofvertices][nofvertices];
	}
	
	void addEdge(int src, int dest) {
		adjMatrix[src][dest] = 1;
		adjMatrix[dest][src] = 1;
	}
	void display() {
		for(int i =0;i<nofvertices;i++) {
			for(int j =0;j<nofvertices;j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	void repmoveEdge(int remsrc, int remdest) {
		adjMatrix[remsrc][remdest] = 0;
		adjMatrix[remdest][remsrc] = 0;
	}
	
}
public class GenerateAdjacencyMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Graph g = new Graph(v);
		
		for(int i =0;i<e-1;i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			g.addEdge(src,dest);
		}
		System.out.println("Original Matrix : ");
		g.display();
		int remsrc = sc.nextInt();
		int remdest = sc.nextInt();
		
		
		g.repmoveEdge(remsrc, remdest);
		System.out.println("Matrix after removing edge "+remsrc+" --> "+remdest+" : ");
		g.display();
	}
}
	
/*
Test Case 1 :
input:
4
5
0 1
0 2
1 2
2 0
2 3
output:
Original Matrix : 
0 1 1 0 
1 0 1 0 
1 1 0 1 
0 0 1 0 
*/