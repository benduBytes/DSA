package SortingAlgorithms1;
import java.util.*;

//TimeComplexity - O(N^2)
public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =1;i<n;i++) {
			int key =arr[i];
			int j = i -1;
				
			/* Move elements of arr[0..i-1], that are
	           greater than key, to one position ahead
	           of their current position */
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j +1] = key;
		}
		for(int i =0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
/*
Test Case 1 :
input:
5
6 9 4 5 6
output:
4 5 6 6 9 

Test Case 2 :
input:
5
5 1 4 2 8
output:
1 2 4 5 8
*/