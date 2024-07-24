package LinkedList;
import java.util.*;

class NodeM{
	int data;
	NodeM next;
	NodeM(int data){
		this.data = data;
		this.next = null;
	}
}
public class InsersionAtMiddle { //similar to insertion to end 
	NodeM head = null;
	
	void insertNode(int data) {
		NodeM newnode = new NodeM(data);
		if(head == null) {
			head = newnode;
			return;
		}

		NodeM temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		
	}
	
	void insertatpos(int pos, int val) {
		NodeM newnode = new NodeM(val);
		if(pos ==0) {
			newnode.next = head;
			head = newnode;
			return;
		}
		NodeM temp = head;
		for(int i =1;i<pos;i++) {
			if(temp != null) {
				temp = temp.next;
			}
		}
		if(temp != null) {
			newnode.next = temp.next;
			  temp.next = newnode;
		}
	}
	
	void deletepos(int pos) {
		
		if(head == null) {
			return;
		}
		if(pos == 0) {
			head = head.next;
		}
		NodeM temp = head;
		NodeM p = null;
		for(int i =0;i<pos;i++) {
			p = temp;
			if(temp.next != null) {
				temp = temp.next;
			}else {
				return;
			}
		}
		if(p != null && temp != null) {
			p.next = temp.next;
		}
	}
	
	void display() {
		NodeM temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		InsersionAtMiddle list = new InsersionAtMiddle();
		for(int i =0;i<n;i++) {
			int data = sc.nextInt();
			list.insertNode(data);
		}
		list.display();
		int pos = sc.nextInt();
		int value = sc.nextInt();
		list.insertatpos(pos, value);
		list.display();
		int del = sc.nextInt();
		list.deletepos(del);
		list.display();
	}
}
