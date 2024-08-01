package StackApplication;
import java.util.*;

public class BalencedExpression {
	
	public static boolean checkBalancedExpr(String exp) {
		Stack<Character> s = new Stack<>();
		char x;
		for(int i =0;i<exp.length();i++) {
			char ch  = exp.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{') {
				s.push(ch);
				continue;
			}if(s.isEmpty()) {
				return false;
			}
			
			switch(ch) {
				case ')':
					x = s.pop();
					if(x =='{' || x =='[') {
						return false;
					}
					break;
				case '}':
					x = s.pop();
					if(x =='(' || x =='[') {
						return false;
					}
					break;
				case ']':
					x = s.pop();
					if(x =='{' || x =='(') {
						return false;
					}
					break;
			}
		}
		return s.isEmpty();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();
		
		if(checkBalancedExpr(expr)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}


/*
INPUT FORMAT

Case 1 :
input [()]{}{[()()]()}([) 
output False

Case 2 :[()]{}{[()()]()}
input True

*/