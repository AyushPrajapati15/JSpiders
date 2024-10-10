package prime_Exception;
import java.util.Scanner;

public class Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + "is a prime number");
        }
        else
        {
            try
            {
                primeException e=new primeException();
            }
            catch(primeException e)
            {
                
            }
        }

    }
    

    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if (n % i == 0) {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else {
            return false;
        }
    }
}