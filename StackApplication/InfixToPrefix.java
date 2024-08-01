package StackApplication;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
	
	public static String infixToPrefix(String infix) {
		String revInfix = revWithBracket(infix);
		String postfix = infixToPostfix(revInfix);
		
		return new StringBuilder(postfix).reverse().toString();
	}
	public static String revWithBracket(String infix) {
		StringBuilder revstr = new StringBuilder(infix.length());
		for(int i = infix.length() -1;i>=0;i--) {
			char ch = infix.charAt(i);
			if(ch == '(') {
				revstr.append(')');
			}else if(ch == ')') {
				revstr.append('(');
			}else{
				revstr.append(ch);
			}
		}
		return revstr.toString();
	}
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
		String prefix = infixToPrefix(infix);
		System.out.println(prefix);
		
	}
}
