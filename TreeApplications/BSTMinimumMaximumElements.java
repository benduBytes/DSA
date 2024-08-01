package TreeApplications;
import java.util.*;

class node2{
	int data;
	node3 left;
	node3 right;
	node2(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class BSTMinimumMaximumElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Character> t = new TreeSet<>();
		int size = sc.nextInt();
		while(size != 0) {
			char c = sc.next().charAt(0);
			t.add(c);
			size--;
		}
		if(!t.isEmpty()) {
			System.out.println("Min : "+t.first());
			System.out.print("Max : "+t.last());
		}
	}
}
/*
 * Test Case 1:
 * input :
 * 5
 * Z E W T Y
 * output :
 * Minimum value: E
 * Maximum value: Z
 * 
 * Test Case 2:
 * input :
 * 7
 * 5 6 7 1 2 8 9
 * output :
 *Minimum value: 1
 * Maximum value: 9
 * 
 */