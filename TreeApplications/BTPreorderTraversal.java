package TreeApplications;
import java.util.*;

class node1{
	int data;
	node1 left,right;
	
	node1(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class BTPreorderTraversal {
	
	public static node1 insertLevelOrder(int arr[], node1 root,int i,int n) {
		if(i<n) {
			node1 temp = new node1(arr[i]);
			root = temp;
			root.left = insertLevelOrder(arr,root.left,2*i+1,n);
			root.right = insertLevelOrder(arr,root.right,2*i+2,n);
		}
		return root;
	}
	public static int displayPreSum(node1 root) {
		if(root == null) {
			return 0;
		}
		int sum = root.data;
		System.out.print(root.data+" ");
		sum += displayPreSum(root.left);
		sum += displayPreSum(root.right);
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		node1 root = null;
		root = insertLevelOrder(arr,root,0,n);
		int sum = displayPreSum(root);
		System.out.println(sum);
	}
	
}

/*
 * Test Case 1:
 * input :
 * 4
 * 14 62 34 27
 * output :
 * preorder Traversal : 15 62 27 34
 * Sum: 138 
 * 
 * Test Case 2:
 * input :
 * 6
 * 9 5 3 7 1 2
 * output :
 * preorder Traversal : 9 5 7 1 3 2
 * Sum: 27
 * 
 */
