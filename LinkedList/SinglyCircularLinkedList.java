package LinkedList;
import java.util.*;

/*
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/
public class SinglyCircularLinkedList {
	NodeM head = null;
//	//insertion at beging
//	void insertNode(int data) {
//		Node newnode = new Node(data);
//		if(head == null) {
//			newnode.next = newnode;
//			head = newnode;
//		}else {
//			newnode.next = head.next;
//			head.next = newnode;
//		}
//	}
	//inserton at end
		void insertNode(int data) {
			NodeM newnode = new NodeM(data);
			if(head == null) {
				newnode.next = newnode;
				head = newnode;
			}else {
				NodeM temp = head;
				while( temp.next != head) {
					temp = temp.next;
				}
				temp.next = newnode;
				newnode.next = head;
			}
			
			
		}
	void delete() {
		
	}
//	//for diplaying elements inserted at begingin
//	void display() {
//		if(head == null) {
//			return;
//		}
//		Node temp = head.next;
//		do{
//			System.out.print(temp.data+" ");
//			temp = temp.next;
//		}while(temp != head.next);
//	}
	//for diplaying elements inserted at end
	void display() {
		if(head == null) {
			return;
		}
		NodeM temp = head;
		do{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}while(temp != head);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
		
		for(int i =0;i<n;i++) {
			int data = sc.nextInt();
			list.insertNode(data);
		}
		list.display();
	}
}
