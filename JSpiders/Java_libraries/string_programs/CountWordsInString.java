/*WAPTC number of words present in a given string */
import java.util.Scanner;
public class CountWordsInString{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String");
        String s = "Jspider Java Developer";
        String[] s1 = s.split(" ");
        // System.out.println(s1.length);.
        int count = 0;
        for(int i=0;i<=s1.length-1;i++)
        {
            count++;
        }
        System.out.println("No of words present"+count);
    }
}
