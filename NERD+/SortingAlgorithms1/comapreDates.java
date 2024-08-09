package SortingAlgorithms1;
import java.util.*;


class Date{
	int day;
	int month;
	int year;
	Date(int day, int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
}
public class comapreDates {
	public static void selectionSort(Date[] arr) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			int minIndex = i;
			for(int j =i+1; j<n;j++) {
				if(compareDate(arr[j],arr[minIndex])<0) {
					minIndex = j;
				}
			}
			Date temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static int compareDate(Date d1, Date d2) {
		if(d1.year != d2.year) {
			return d1.year - d2.year;
		}
		else if(d1.month != d2.month) {
			return d1.month - d2.month;
		}else {
			return d1.day - d2.day;
		}
	}
	public static void printDates(Date[] arr) {
		for(Date d:arr) {
			System.out.println(d.day+" "+d.month+" "+d.year);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Date[] dates = new Date[n];
		for(int i =0;i<n;i++) {
			int day = sc.nextInt();
			int month = sc.nextInt();
			int year = sc.nextInt();
			dates[i] = new Date(day,month,year);
		}
		selectionSort(dates);
		printDates(dates);
		
	}
}

/*
Test Case 1 :
input:
5
20 04 2016
15 06 2018
11 09 2019
30 04 1992
16 11 2000
output:
30 4 1992
16 11 2000
20 4 2016
15 6 2018
11 9 2019

*/
