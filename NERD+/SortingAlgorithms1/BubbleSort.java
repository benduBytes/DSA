package SortingAlgorithms1;
import java.util.*;

//TimeComplexity - O(N^2)
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0;i<n-1;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
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