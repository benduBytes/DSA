package TreeApplications;
import java.util.*;

class node3{
	int data;
	node3 left;
	node3 right;
	node3(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class CheckSymmetryBST {
	public static node3 newNode(int data) {
		return new node3(data);
	}
	public static node3 insert(node3 root, int data) {
		if(root == null) {
			root = newNode(data);
			return root;
		}
		if(data < root.data) {
			root.left = insert(root.left,data);
		}if(data > root.data) {
			root.right = insert(root.right,data);
		}
		return root;
	}
	public static boolean isIdentical(node3 root1, node3 root2) {
		if(root1 == null && root2 == null) {
			return true;
		}else if(root1 == null || root2 == null) {
			return false;
		}else {
			if(root1.data == root2.data && isIdentical(root1.left,root2.left) &&
					isIdentical(root1.right,root2.right)) {
				return true;
			}else {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		node3 root1 = null, root2 = null;
		int data;
		while(true) {
			data = sc.nextInt();
			if(data == -1) {
				break;
			}
			root1 = insert(root1, data);	
		}
		while(true) {
			data = sc.nextInt();
			if(data == -1) {
				break;
			}
			root2 = insert(root2, data);	
		}
		if(isIdentical(root1,root2)) {
			System.out.println("Identical");
		}else {
			System.out.println("Not identical");
		}
	}
}


/*
Test case - 1
input :
5 3 8 2 4 -1  // -1 indicate stoping condition
5 3 8 2 4 -1
output :
Both BSTs are identical

Test case - 2
input :
10 5 15 18 32 -1  // -1 indicate stoping condition
10 5 18 15 32 -1
output :
Both BSTs not identical
*/
