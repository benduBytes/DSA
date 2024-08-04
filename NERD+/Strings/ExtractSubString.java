package Strings;
import java.util.*;
public class ExtractSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abc = sc.nextInt();
		
		sc.nextLine();
		while(abc>0) {
			String Str = sc.nextLine();
			String subStr = sc.nextLine();
			
			
			
			int n1 = Str.length();
			int n2 = subStr.length();
			char[] charArray = Str.toCharArray();
			char[] charArraySubString = subStr.toCharArray();
			
			
			int globalcount = 0;
			for(int i =0;i<n1;i++) {
				if(charArray[i] == charArraySubString[0]) {
					int temp = i;
					int count = 1;
					for(int j =1;j<n2;j++) {
						i++;
						if(charArray[i] == charArraySubString[j]) {
							count++;
						}if(count == n2) {
							System.out.println(temp);
							globalcount++;
						}
					}
					//i = temp;
				}
				if(i == n1-1 && charArray[i] != charArraySubString[0] && globalcount ==0) {
					System.out.println(0);
				}
				
			}
			
			abc--;
		}
		
		
		
	}
}
