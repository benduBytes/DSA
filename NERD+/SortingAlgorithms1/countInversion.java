package SortingAlgorithms1;
import java.util.*;

public class countInversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i =0;i<n-1;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
					//System.out.print("("+arr[j]+" , "+arr[i]+") ");
					
				}
			}
		}
		System.out.println();
		System.out.println(count);
	}
}

/*
Sample test case:
Input 1 :
4
8 4 2 1
Output 1 :
6

Input 2 :
5
20 45 19 37 58
Output 2 :
3

Input 3 :
5
29 37 42 54 61
Output 3 :
0

Input 4 :
3
100 100 100
Output 4 :
0
*/
