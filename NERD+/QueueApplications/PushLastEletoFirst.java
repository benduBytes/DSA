package QueueApplications;
import java.util.*;

public class PushLastEletoFirst {
	
	public static void move(Queue<Integer> q) {
	    if(q.isEmpty() || q.size() == 1) {
	        return;
	    }
	    Queue<Integer> temp = new LinkedList<>();
	    while(q.size() > 1) {
	        temp.offer(q.poll());
	    }
	    while(!temp.isEmpty()) {
	        q.offer(temp.poll());
	    }
	}
	public static void display(Queue<Integer> q) {
	    for(int e : q) {
	        System.out.print(e + " ");
	    }
	    System.out.println();
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Queue<Integer> q = new LinkedList<>();
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++) {
	        int element = sc.nextInt();
	        q.offer(element);
	    }
	    move(q);
	    display(q);
	}
}

/*
 * case-1
 * input: 4    62 85 47 98
 * output: 98 62 85 47 
 */ 
