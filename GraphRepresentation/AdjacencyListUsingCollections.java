package GraphRepresentation;
import java.util.*;

class Graph1{
	int nofvertices;
	ArrayList<ArrayList<Integer>> adjList;
	Graph1(int nofvertices){
		this.nofvertices = nofvertices;
		adjList = new ArrayList<>(nofvertices);
		for(int i =0;i<nofvertices;i++) {
			adjList.add(new ArrayList<>());
		}
	}
	void addEdge(int src, int dest) {
		adjList.get(src).add(dest);
	}
	void display() {
		for(int i =0;i<nofvertices;i++) {
			System.out.print(i+" -> ");
			for(int j : adjList.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
public class AdjacencyListUsingCollections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Graph1 g = new  Graph1(v);
		
		for(int i =0;i<e;i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			g.addEdge(src,dest);
		}
		g.display();
	}
}

/*
Test Case 1 :
input:
3 3
0 1
1 2
2 0
output:
0 -> 1
1 -> 2
2 -> 0

Test Case 2 :
input:
4 5
0 1
1 2
1 3
2 3
3 0
output:
0 -> 1
1 -> 2 3
2 -> 3
3 -> 0
*/