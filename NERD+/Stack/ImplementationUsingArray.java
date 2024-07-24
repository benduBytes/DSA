package Stack;
import java.util.*;

public class ImplementationUsingArray {
	
	private static int max_size = 100;
	private static int stack[] = new int[max_size];
	private static int top = -1;
	
	public static void  push(int value) {
		if(top == max_size-1) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = value;
		System.out.println("Element " + value + " is pushed onto the stack");
	}
	public static void  pop() {
		if(top == -1) {
			System.out.println("Stack Underflow");
			return;
		}
		int element = stack[top--];
		System.out.println("Element " + element + " is popped from the stack");
		
	}
	public static void  display() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.print("Elements in the Stack : ");
		for(int i = top;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,value;
		do {
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				value = sc.nextInt();
				push(value);
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.out.println("Exiting the Program");
				break;
			default:
				System.out.println("Invalid choice");
			}
		
		}while(choice != 4);
		
	}
}
