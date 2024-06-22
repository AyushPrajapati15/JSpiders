import java.util.Scanner;
public class NumPlusRevIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num = sc.nextInt();
        int count = 0;
        while(true)
        {
            if(isPalindrome(num))
            {
                System.out.println("The palindrome number is " + num+" and it is come in "+count+" times");
                break;
            }
            else
            {
                num = num + reverse(num);
                count++;
            }

        }

    }

    public static boolean isPalindrome(int num) {
        int temp = reverse(num);
        if (num == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverse(int num) {
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev;
    }

}
