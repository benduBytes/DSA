package GraphAlgorithm2;
import java.util.*;
//Travelling Salesman Problem using Greedy Method
public class TSP {
	static final int MAX = 10;
	static int[][] arr = new int[MAX][MAX];
	static boolean[] completed = new boolean[MAX];
	static int n, cost = 0;
	
	static void takeInput() {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            completed[i] = false;
        }
        sc.close();
	}
	static void minCost(int city) { // starting node is given as the parameter
		completed[city] = true;
		System.out.print((city+1)+" -> ");
		int ncity = least(city);
		if(ncity == 999) {
			ncity = 0;
			System.out.println((ncity+1));
			cost += arr[city][ncity];
			return;
		}
		minCost(ncity);
	}
	static int least(int c) {
		int nc = 999; //number of cities
		int min = 999; // minimum cost
		for(int i =0;i<n;i++) {
			if(arr[c][i] !=0 && !completed[i]) { //arr[c][i] !=0 diagonal case self loop
				if(arr[c][i] <min) {
					min = arr[c][i];
					nc = i;
				}
			}
		}
		if(min!=999) {
			cost+=min;
		}
		return nc;
	}
	public static void main(String[] args) {
		takeInput();
		System.out.println("The Path is: ");
		minCost(0);
		System.out.println();
		System.out.println("Minimum cost: "+cost);
	}
}
/*
Test Case 1 :
input:
3
0 10 15
10 0 20
15 20 0
output:
1 -> 2 -> 3 -> 1

Test Case 2 :
input:
4
0 4 1 3
4 0 2 1
1 2 0 5
3 1 5 0
output:
1 -> 3 -> 2 -> 4 -> 1

*/