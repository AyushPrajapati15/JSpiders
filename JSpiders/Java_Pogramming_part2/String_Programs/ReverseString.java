/*
 * Reverse a String: Write a function that takes a string as input and returns the string reversed.
Example: "hello" → "olleh"

 */

import java.util.Scanner;

class ReverseString {
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

        

        System.out.println( reverse(s));
    }

 }