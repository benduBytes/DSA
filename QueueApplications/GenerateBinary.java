package QueueApplications;
import java.util.*;

public class GenerateBinary {
	public static void generatebinary(int n ) {
		Queue<String> q = new LinkedList<>();
		q.add("1"); //1 = 1   2 = 10    3 = 11
		for(int i =1;i<=n;i++) {
			String current = q.poll();
			System.out.println(current);
			
			q.add(current+ "0");
			q.add(current + "1");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		generatebinary(n);
	}
}
/*
TestCase 1
input : 3   1 2 3
output : 1 10 11

*/

/*
using inbuild method

int n = sc.nextInt();
for(int i =0;i<n;i++) {
	int a = sc.nextInt();
	System.out.print(Integer.toBinaryString(a)+" ");
}
*/