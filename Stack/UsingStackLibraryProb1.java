package Stack;
import java.util.Scanner;
import java.util.Stack;


public class UsingStackLibraryProb1 {
	public static void calculate(int n) {
		Stack<Integer> s = new Stack<>();
		for(int i =1;i<=n;i++) {
			if(n%i ==0) {
				s.push(i);
			}
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		calculate(n);
	}
}
