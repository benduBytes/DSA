package Stack;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class ImplementationUsingLinkedList {
	Node head = null;
	
	void push(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
			System.out.println("Node is Inserted");
			return;
		}
		newnode.next = head;
		head = newnode;
		System.out.println("Node is Inserted");
	}
	void pop() {
		if(head == null) {
			System.out.println("Empty Stack");
			return;
		}
		Node temp = head;
		System.out.println("Popped Element : " + temp.data);
		head = temp.next;
		
	}
	void display() {
		if(head == null) {
			System.out.println("Empty Stack");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		ImplementationUsingLinkedList s = new ImplementationUsingLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice, value;
		do {
			choice = sc.nextInt();
			switch(choice){
				case 1:
					value = sc.nextInt();
					s.push(value);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice");
				
			}
		}while(choice != 4);
		
		
	}
}
