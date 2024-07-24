package LinkedList;
import java.util.Scanner;
/*
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
public class InsertionAtEnd {
    NodeM head = null;
    
    void insertList(int data) {
        NodeM newnode = new NodeM(data);
        if (head == null) {
            head = newnode;
            return;
        }
        NodeM temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    
    void deletion() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        NodeM temp = head;
        NodeM prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        if (prev != null) {
            prev.next = null;
        }
    }
    
    void display() {
        NodeM temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InsertionAtEnd list = new InsertionAtEnd();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertList(data);
        }
        list.display();
        int del = sc.nextInt();
        for (int i = 0; i < del; i++) {
            list.deletion();
        }
        list.display();
        sc.close();
    }
}
