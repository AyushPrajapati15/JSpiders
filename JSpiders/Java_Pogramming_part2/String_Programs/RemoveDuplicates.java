/*
Remove Duplicates: Write a function to remove duplicate characters from a string.
Example: "programming" → "progamin"
 */

import java.util.Scanner;

class RemoveDuplicates{

     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         String s = sc.next();
         String res="";
         for(int i=0;i<s.length();i++)
         {
            char c = s.charAt(i);
            int count = 0;
            for (int j = 0; j < res.length(); j++) {
                char c1 = res.charAt(j);
                if (c == c1) {
                    count++;
                }
            }
            if (count == 0) {
                res += c;
            }
        }
        System.out.println(res);

         
    }
 }