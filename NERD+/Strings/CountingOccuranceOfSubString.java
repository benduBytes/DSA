package Strings;
import java.util.*;
import java.util.Scanner;

public class CountingOccuranceOfSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Str = sc.nextLine();
		String subStr = sc.nextLine();
		
		
		
		int n1 = Str.length();
		int n2 = subStr.length();
		char[] charArray = Str.toCharArray();
		char[] charArraySubString = subStr.toCharArray();
		
		for(int i =0; i<n1;i++) {
			System.out.print(charArray[i]+" ");
		}
		System.out.println();
		for(int i =0; i<n2;i++) {
			System.out.print(charArraySubString[i]+" ");
		}
		System.out.println();
		int count1 =0;
		for(int i =0;i<n1;i++) {
			if(charArray[i] == charArraySubString[0]) {
				int temp = i;
				int count = 1;
				for(int j =1;j<n2;j++) {
					i++;
					if(charArray[i] == charArraySubString[j]) {
						count++;
					}if(count == n2) {
						count1++;
						System.out.println("String Found Index staring from : "+temp);
					}
				}
				i = temp;
			}
		}
		System.out.println("Occurance : "+count1);
		
		
	}
}
