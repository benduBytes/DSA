package ApplicationOfLinkedList;
import java.util.*;


class Node{
	int coeff;
	int exp;
	Node next;
	
	Node(int coeff, int exp){
		this.coeff = coeff;
		this.exp = exp;
		this.next = null;
	}
}
public class PolynomialManupulation {
	
	public static Node addTerm(Node head,int coeff,int exp){
		Node newnode = new Node(coeff,exp);
		if(head == null) {
			return newnode;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		return head;
	}
	//Code for additon of two polynomial
//	public static Node addPoly(Node poly1, Node poly2) {
//		Node res = null;
//		Node p1 = poly1;
//		Node p2 = poly2;
//		while(p1 != null && p2 != null) {
//			if(p1.exp == p2.exp) {
//				res = addTerm(res,p1.coeff+p2.coeff,p1.exp);
//				p1 = p1.next;
//				p2 = p2.next;
//			}else if(p1.exp > p2.exp){
//				res = addTerm(res,p1.coeff,p1.exp);
//				p1 = p1.next;
//			}else if(p2.exp > p1.exp){
//				res = addTerm(res,p2.coeff,p2.exp);
//				p2 = p2.next;
//			}
//		}
//		while(p1 != null) {
//			res = addTerm(res,p1.coeff,p1.exp);
//			p1 = p1.next;
//		}
//		while(p2 != null) {
//			res = addTerm(res,p2.coeff,p2.exp);
//			p2 = p2.next;
//		}
//		
//		return res;
//	}
	
	//Comparing two polynomial
	public static boolean comparePoly(Node poly1,Node poly2) {
		Node p1 = poly1,p2 = poly2;
		while(p1 != null && p2 != null) {
			if(p1.coeff != p2.coeff || p1.exp != p2.exp) {
				return false;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1==null && p2==null;
	}
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print("("+temp.coeff+"x^"+temp.exp+")");
			if(temp.next != null) {
				System.out.print(" + ");
			}
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PolynomialManupulation obj = new PolynomialManupulation();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		Node poly1 = null;
		for(int i =0;i<n1;i++) {
			int coeff = sc.nextInt();
			int exp = sc.nextInt();
			poly1 = addTerm(poly1,coeff,exp);
			
		}
		int n2 = sc.nextInt();
		Node poly2 = null;
		for(int i =0;i<n2;i++) {
			int coeff = sc.nextInt();
			int exp = sc.nextInt();
			poly2 = addTerm(poly2,coeff,exp);
			
		}
		//Node res = addPoly(poly1,poly2);
		//display(res);
		
		System.out.print("Polynomial 1: ");
		display(poly1);
		System.out.print("Polynomial 2: ");
		display(poly2);
		if(comparePoly(poly1,poly2)) {
			System.out.println("Polynomials are Equal");
		}else {
			System.out.println("Polynomials are not Equal");
		}
	}
}
