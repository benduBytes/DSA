package QueueApplications;
import java.util.*;

class MovingAvg{
	private Queue<Integer> q;
	private double sum;
	
	MovingAvg(){
		q = new LinkedList<>();
		sum = 0;
	}
	public double calculate(int value) {
		q.add(value);
		sum += value;
		return sum/q.size();
	}
	
}
public class MovingAverage {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    MovingAvg m = new MovingAvg();
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++) {
	        int element = sc.nextInt();
	        System.out.printf("%.2f ",m.calculate(element));
	    }
	}
}

/*
TestCase - 1
input : 3     1 2 3
output : 1.00 1.50 2.00
*/