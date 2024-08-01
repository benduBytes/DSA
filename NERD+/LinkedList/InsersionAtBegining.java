package LinkedList;
import java.util.*;

class Node{
	int data;
	NodeM next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class InsersionAtBegining {
	NodeM head = null;
	void insertList(int data) {
		NodeM newnode = new NodeM(data);
		if(head == null) {
			head = newnode;
		}else {
			newnode.next = head;
			head = newnode;
		}
	}
	void display() {
		NodeM temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		InsersionAtBegining list = new InsersionAtBegining();
		for(int i =0;i<n;i++) {
			int data = sc.nextInt();
			list.insertList(data);
		}
		list.display();
		sc.close();
	}
}
	