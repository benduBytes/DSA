package QueueApplications;
import java.util.*;

public class SortQueueCircularCheck {
	
	public static boolean isQueueSorted(Queue<Integer> q) {
		if(q.isEmpty()) {
			return true;
		}
		int prev = q.poll();
		while(!q.isEmpty()) {
			if(prev>q.peek()) {
				return false;
			}
			prev = q.poll();
		}
		return true;
	}
	public static boolean canSort(Queue<Integer> q) {
		int n = q.size();
		for(int i = 0;i<n;i++) {
			if(isQueueSorted(new LinkedList<>(q))) {
				return true;
			}
			q.add(q.poll());
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			int element = sc.nextInt();
			q.offer(element);
		}
		if(canSort(q)) {
			System.out.println("Queue with size "+ n+ " can be sorted");
		}else {
			System.out.println("Queue with size "+ n+ " cannot be sorted");
		}
	}
}

/*
Test Case 1 :
input :
4
19 29 12 18
output:
Queue with size 4 can be sorted

TestCase 2:
input :
7
4 5 6 7 8 9 3
output :
Queue with size 7 can be sorted
*/