package TreeApplications;
import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		Node left = null;
		Node right = null;
	}
}
public class BTSTLowestAncestor {
	static Node newNode(int data) {
		return new Node(data);
	}
	public static Node insert(Node root, int data) {
		if(root == null) {
			return newNode(data);
		}
		if(data < root.data) {
			root.left = insert(root.left, data);
		}if(data < root.data) {
			root.right = insert(root.left, data);
		}
		return root;
	}
	public static Node lca(Node root, int n1, int n2) {
		if(root == null) {
			return null;
		}if(root.data >n1 && root.data >n2) {
			return lca(root.left,n1,n2);
		}if(root.data <n1 && root.data <n2) {
			return lca(root.right,n1,n2);
		}
		return root;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		for(int i =0;i<n;i++) {
			int r = sc.nextInt();
			root = insert(root,r);
		}
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		Node l = lca(root,n1,n2);
		System.out.println(l.data);
	}
}
/*
 * Test Case 1 :
 * input : 6         10 5 12 3 8 15      3  8
 * output : 5
 */