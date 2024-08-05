package GraphAlgorithm2;
import java.util.*;

public class BruteForceTSP {
    public static int minCost = Integer.MAX_VALUE;
    public static List<Integer> bestRoute = new ArrayList<>();
    
    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void permute(List<Integer> list, int l, int r, int[][] costMat) {
        if (l == r) {
            calculateCost(list, costMat);
        } else {
            for (int i = l; i <= r; i++) {
                swap(list, l, i);
                permute(list, l + 1, r, costMat);
                swap(list, l, i); // backtrack
            }
        }
    }

    public static void calculateCost(List<Integer> route, int[][] costMat) {
        int currentCost = 0;
        for (int i = 0; i < route.size() - 1; i++) {
            currentCost += costMat[route.get(i)][route.get(i + 1)];
        }
        currentCost += costMat[route.get(route.size() - 1)][route.get(0)];
        if (currentCost < minCost || (currentCost == minCost && isLexicographicallySmaller(route, bestRoute))) {
            minCost = currentCost;
            bestRoute = new ArrayList<>(route);
            bestRoute.add(route.get(0)); // Completing the tour
        }
    }

    public static boolean isLexicographicallySmaller(List<Integer> route1, List<Integer> route2) {
        for (int i = 0; i < route1.size(); i++) {
            if (route1.get(i) < route2.get(i)) {
                return true;
            } else if (route1.get(i) > route2.get(i)) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] costMat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                costMat[i][j] = sc.nextInt();
            }
        }
        List<Integer> currRoute = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            currRoute.add(i);
        }
        permute(currRoute, 1, n - 1, costMat); // Fixing the first city as starting point
        System.out.println("The path is:");
        for (int i = 0; i < bestRoute.size(); i++) {
            System.out.print(bestRoute.get(i) + 1);
            if (i != bestRoute.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
        System.out.println("Minimum Cost: " + minCost);
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
The path is:
1 -> 2 -> 3 -> 1
Minimum Cost:45

Test Case 2 :
input:
4
0 4 1 3
4 0 2 1
1 2 0 5
3 1 5 0
output:
The path is:
1 -> 3 -> 2 -> 4 -> 1
Minimum Cost: 7

Test Case 3 :
input:
4
0 10 15 20
10 0 35 25
15 35 0 30
20 25 30 0
output:
The path is:
1 -> 2 -> 4 -> 3 -> 1
Minimum Cost: 80
*/