package Tree;
import java.util.*;

class Node1{
	int data;
	Node1 left, right;
	Node1(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class Inorder {
	
	public static void displayinorder(Node1 temp ) {
		if(temp != null) {
			displayinorder(temp.left);
			System.out.print(temp.data +" ");
			displayinorder(temp.right);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		int n = 5;
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		Node1 root = new Node1(arr[0]);
		root.left = new Node1(arr[1]);
		root.right = new Node1(arr[2]);
		root.left.left = new Node1(arr[3]);
		root.right.right = new Node1(arr[4]);
		
		displayinorder(root);
	}
}
/*
 * Test Case 1 :
 * input : 1 2 3 4 5
 * output : 4 2 1 3 5
 */

