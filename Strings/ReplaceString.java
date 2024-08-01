package Strings;
import java.util.*;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String oldstr = sc.nextLine();
		String newstr = sc.nextLine();
		
		StringBuilder res = new StringBuilder();
		int slen = s.length();
		int oldlen = oldstr.length();
		int i =0;
		for(i =0;i<=slen-oldlen;i++) {
			int j;
			for(j =0;j<oldlen;j++) {
				if(s.charAt(i+j) != oldstr.charAt(j)) {
					break;
				}
			}
			if(j == oldlen) {
				res.append(newstr);
				i = i+oldlen -1;
			}
			else {
				res.append(s.charAt(i));
			}
		}
		res.append(s.substring(i));
		System.out.println(res.toString());
	}
}
