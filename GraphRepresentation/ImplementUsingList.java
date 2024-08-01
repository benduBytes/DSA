package GraphRepresentation;
import java.util.*;

class Node {
    int vertex;
    Node next;

    Node(int vertex) {
        this.vertex = vertex;
        this.next = null;
    }
}

public class ImplementUsingList {
    int vertices;
    Node adjList[];

    ImplementUsingList(int vertices) {
        this.vertices = vertices;
        adjList = new Node[vertices];
    }

    void addEdge(int src, int dest) {
        Node newNode = new Node(dest);
        newNode.next = adjList[src];
        adjList[src] = newNode;
    }

    void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            Node current = reverse(adjList[i]);
            while (current != null) {
                System.out.print(current.vertex + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node n = current.next;
            current.next = prev;
            prev = current;
            current = n;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        ImplementUsingList g = new ImplementUsingList(v);

        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            g.addEdge(src, dest);
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