// Count Vowels and Consonants: Write a function to count the number of vowels and consonants in a given string.
// Example: "hello" → Vowels: 2, Consonants: 3

import java.util.Scanner;

public class CountVowelAndConsonants {

    public static void check(String s)
    {
        int vCount=0;
        int cCount=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vCount++;

            } else
                cCount++;
        }
        System.out.println("Vowels in "+s+" is "+vCount+" and consonant is "+cCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check vowels and consonant");
        String s = sc.next();

        check(s);
        // System.out.println(s);
    }
    
}
