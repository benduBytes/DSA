package SortingAlgorithms2;
import java.util.*;

public class MergeSort {
	void sort(int arr[],int l,int r) {
		if(l<r) {
			int m = (l+r)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}
	}
	void merge(int arr[], int l,int m,int r) {
		// Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        
	}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Given Array");
		printArray(arr);
		
		MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
	}
}
/*
Sample test case:
Input 1 :
4
8 4 2 1
Output 1 :
Given Array
8 4 2 1 
Sorted array
1 2 4 8 

Input 2 :
5
20 45 19 37 58
Output 2 :
Given Array
20 45 19 37 58 
Sorted array
19 20 37 45 58 

Input 3 :
5
29 37 42 54 61
Output 3 :
Given Array
29 37 42 54 61 
Sorted array
29 37 42 54 61 

Input 4 :
3
100 100 100
Output 4 :
Given Array
100 100 100 
Sorted array
100 100 100 
*/