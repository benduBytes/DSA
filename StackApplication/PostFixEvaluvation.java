package StackApplication;
import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluvation {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String postfix = sc.nextLine();
		String tokens[] = postfix.split("[ \t]+"); // split the charcter when whitespaces appears
		Stack<Integer> s = new Stack<>();
		for(String token : tokens) {
			if(token.matches("\\d+")) { //matches with numbers
				Integer op = Integer.parseInt(token);
				s.push(op);
			}
			else if(token.matches("[+\\-*/]")) {
				Integer op1 = s.pop();
				Integer op2 = s.pop();
				switch(token) {
					case "+":
						s.push(op2+op1);
						break;
					case "-":
						s.push(op2-op1);
						break;
					case "/":
						s.push(op2/op1);
						break;
					case "*":
						s.push(op2*op1);
						break;
				}
			}
			else {
				System.out.println("Error");
			}
		}
		if(s.size() == 1) {
			System.out.println(s.pop());
		}else {
			System.out.println("Error");
		}
	}
}
