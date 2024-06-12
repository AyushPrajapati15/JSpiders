/*WAPTP ASCII values of odd index char present in a given string */
import java.util.Scanner;
public class AsciiValueOfOddIndexInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        for(int i=0;i<=s.length()-1;i++)
        {
            if (i%2==1) {
                char ch=s.charAt(i);
                System.out.print(s.charAt(i)+" "); 
                System.out.println(s.codePointAt(i)+" ");
                // System.out.println((int)ch+" ");
            }
        }
    }
}
