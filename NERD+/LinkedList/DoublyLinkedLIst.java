package LinkedList;
import java.util.*;

class Node1{
	int data;
	Node1 prev;
	Node1 next;
	
	Node1(int data){
		this.data= data;
		this.prev = null;
		this.next = null;
	}
}
public class DoublyLinkedLIst {
	Node1 head = null;
	void insertNode(int data){
		Node1 newnode = new Node1(data);
		
		if(head == null) {
			head = newnode;
		}else {
			head.prev = newnode;
			newnode.next = head;
			head = newnode;
		}
	}
	void display() {
		Node1 temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		DoublyLinkedLIst list = new DoublyLinkedLIst();
		for(int i =0;i<n;i++) {
			int data = sc.nextInt();
			list.insertNode(data);
		}
		list.display();
		
	}
}
