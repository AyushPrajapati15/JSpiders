package wrapper_program;
import java.util.*;
class Sum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = Integer.parseInt(s);
        int temp = num;
        int ld = 0;
        int sum = 0;
        while(temp!=0)
        {
            ld = temp % 10;
            if (ld % 2 == 0) {
                sum += ld;
            }
            temp /= 10;
        }
        for(int i=1;i<=10;i++)
        {
            System.out.println(sum*i);
        }

    }
}