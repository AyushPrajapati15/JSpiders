
/*
Check Palindrome: Write a function to check if a given string is a palindrome.
Example: "racecar" → true, "hello" → false
 */

import java.util.Scanner;

public class StringPalindrome {

    private static String reverse(String s) {
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1 += s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(s.equals(reverse(s)))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String not is palindrome");
        }
    }

    
}
