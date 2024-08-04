package Tree;
import java.util.*;


class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class Preorder {
	
	public static void displayPreOrder(Node temp) {
		if(temp != null) {
			System.out.print(temp.data+" ");
			displayPreOrder(temp.left);
			displayPreOrder(temp.right);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		int n = 5;
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			 arr[i] = Integer.parseInt(input[i]);
		}
		Node root = new Node(arr[0]);
		root.left = new Node(arr[1]);
		root.right = new Node(arr[2]);
		root.left.left = new Node(arr[3]);
		root.left.right = new Node(arr[4]);
		
		displayPreOrder(root);
		
		
	}
}

/*
 * Test Case 1 :
 * input : 1 2 3 4 5
 * output : 1 2 4 5 3
 */
