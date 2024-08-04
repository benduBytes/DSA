package Tree;
import java.util.*;

class Node2{
	char data;
	Node2 left,right;
	
	Node2(char data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BTSTPostOrder {
	public static Node2 insert(Node2 root, char data) {
		if(root == null) {
			root = new Node2(data);
		}else if(data <= root.data) {
			root.left = insert(root.left,data);
		}else {
			root.right = insert(root.right,data); 
		}
		return root;
	}
	public static void postorder(Node2 temp) {
		if(temp != null) {
			postorder(temp.left);
			postorder(temp.right);
			System.out.print(temp.data+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Node2 root = null;
		
		while(n>0) {
			char input = sc.next().charAt(0);
			root = insert(root,input);
			n--;
		}
		postorder(root);
	}
}

/*
 * Test Case 1 :
 * input : 5         Z E W T Y
 * output : Postorder traversal : T Y W E Z
 */