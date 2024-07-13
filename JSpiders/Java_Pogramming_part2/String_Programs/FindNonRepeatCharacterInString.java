//Find the First Non-Repeated Character: Write a function to find the first non-repeated character in a string.
// Example: "swiss" → 'w'

import java.util.Scanner;

public class FindNonRepeatCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j)&&i!=j)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("First non repeating character in "+s+" is "+s.charAt(i));
                break;
            }
        }
    }
    
}
