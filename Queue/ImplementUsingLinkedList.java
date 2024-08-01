package Queue;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class QueueL{
	Node front = null,rear = null;
	
	public void enqueue(int data) {
		Node temp = new Node(data);
		if(rear == null) {
			front = rear = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
	}
	public void dequeue() {
		if(front == null) {
			return;
		}
		Node temp = front;
		front = front.next;
		if(front == null) {
			rear = null;
		}
	}
}
public class ImplementUsingLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueL q = new QueueL();
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			int element = sc.nextInt();
			q.enqueue(element);
		}
		System.out.println("Before dequeue: "+q.front.data+" "+q.rear.data);
		q.dequeue();
		System.out.println("After dequeue: "+q.front.data+" "+q.rear.data);
		
	}
}
