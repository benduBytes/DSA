package Queue;
import java.util.*;


class Queue{
	private static final int MAX = 5;
	private int items[] = new int[MAX];
	private int front = -1;
	private int rear = -1;
	
	public boolean isFull() {
		return rear == MAX-1;
	}
	public boolean isEmpty() {
		return rear == -1;
	}
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(front == -1) {
				front = 0;
			}
			rear++;
			items[rear] = value;
		}
	}
	public int dequeue() {
		int item;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			item = -1;
		}else {
			item = items[front];
			front++;
			if(front >rear) {
				front = rear = -1;
			}
		}
		return item;	
	}
//	// to reverse the Queue
//	public void reversequeue() {
//		int stack[] = new int[MAX];
//		int top = -1;
//		while(!isEmpty()) {
//			stack[++top] = dequeue();
//		}
//		while(top != -1) {
//			enqueue(stack[top--]);
//		}
//	}
	public void display() {
		if(!isEmpty()) {
			for(int i = front;i<=rear;i++) {
				System.out.print(items[i]+" ");
			}
			System.out.println();
		}
	}
}
public class ImplementUsingArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		for(int i =0;i<5;i++) {
			int element = sc.nextInt();
			q.enqueue(element);
		}
		q.display();
//		q.reversequeue();  //to reverse the Queue
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();	
	}
}
