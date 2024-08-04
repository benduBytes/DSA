package Stack;
import java.util.Scanner;
import java.util.Stack;

public class UsingStackLibraryProb2 {
	public static String revstring(String s) {
		Stack<Character> st = new Stack<>();
		StringBuilder res = new StringBuilder();
		
		for(int i =0;i<s.length();i++) { 
			char c = s.charAt(i);	
			if(c == ' ') {
				while(!st.isEmpty()) {
					res.append(st.pop());
				}
				res.append(' ');
			}
			else {
				st.push(c);
			}
		}
		while(!st.isEmpty()) {
			res.append(st.pop());
		}
		res.reverse();
		return res.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(revstring(str));
	}
}
