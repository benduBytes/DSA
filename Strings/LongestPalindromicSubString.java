package Strings;
import java.util.Scanner;

public class LongestPalindromicSubString {
    
    public static String longestPalin(String s) {
        if (s.length() <= 1) {
            return s;
        }
        
        int n = s.length();
        int maxLength = 1;
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > maxLength) {
                    maxLength = len;
                    start = l;
                }
                l--;
                r++;
            }
            
            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > maxLength) {
                    maxLength = len;
                    start = l;
                }
                l--;
                r++;
            }
        }
        
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = longestPalin(s);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
