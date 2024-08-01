package Strings;
import java.util.*;

public class ReverseSubString {
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
		
		for(int i =0;i<n1;i++) {
			if(charArray[i]== charArraySubString[0]) {
				int count =1;
				int temp = i;
				for(int j =1;j<n2;j++) {
					i++;
					if(charArray[i]== charArraySubString[j]) {
						count++;
					}if(count == n2) {
						System.out.println("Index staring from : "+temp);
						int abcd = temp;
						for (int abc = n2 - 1; abc >= 0; abc--) {
						    charArray[abcd] = charArraySubString[abc];
						    abcd++;
						}
					}
					//i = temp;
				}
				
			
			}
		}
		
		for(int i =0; i<n1;i++) {
			System.out.print(charArray[i]+" ");
		}
		
		
		
		
	}
}
