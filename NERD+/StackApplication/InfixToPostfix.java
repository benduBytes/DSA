package StackApplication;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	public static int precedence(char ch) {
		switch(ch) {
			case '*':
			case '/':
				return 2;
			case '+':
			case '-':
				return 1;
			default:
				 return 0;
		}
	}
	public static boolean isOperator(char ch) {
		return(ch == '+' || ch == '-' || ch =='*' || ch== '/');
	}
	public static String infixToPostfix(String infix) {
		Stack<Character> s = new Stack<>();
		StringBuilder postfix = new StringBuilder();
		
		for(int i =0;i<infix.length();i++) {
			char ch = infix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			}else if(isOperator(ch)){
				while(!s.isEmpty() && precedence(s.peek()) >= precedence(ch)) {
					postfix.append(s.pop());
				}
				s.push(ch);
			}
			else if(ch == '(') {
				s.push(ch);
			}
			else if(ch == ')') {
				while(!s.isEmpty() && s.peek() != '(') {
					postfix.append(s.pop());
				}
				s.pop();
			}
		}
		while(!s.isEmpty()) {
			postfix.append(s.pop());
		}
		
		return postfix.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String infix = sc.nextLine();
		String postfix = infixToPostfix(infix);
		System.out.println(postfix);
		
	}
}
