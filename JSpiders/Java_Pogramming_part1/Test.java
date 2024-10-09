		/*
		Sample Input

		42
		3.1415
		Welcome to HackerRank's Java tutorials!
		Sample Output

		String: Welcome to HackerRank's Java tutorials!
		Double: 3.1415
		Int: 42
		*/

		/*import java.util.Scanner;

		public class Test {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();//5
				int j=1;
				int k=n+1;
				for (int x=k;j<=2 ;x++ )
				{
					int count=0;
					for (int i=1;i<=x ;i++ )
					{
						if (x%i==0)
						{
							count++;
						}
					}
					if (count==2)
					{
						System.out.println(x);
						break;
					}
				}
			}
		}
		*/




/*
import java.util.*;
public class Tribo
{
    int start; int end;
    Tribo()
    {
        start=0;
        end=0;
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        start= sc.nextInt();
    }
    int tribonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1||n==2)
        {
            return 1;
        }
        else
        {
            return tribonacci(n-1)+tribonacci (n-2)+tribonacci(n-3);
        }
    }
    void display()
    {
        int num = tribo(start);
        int end = sum(tribonacci(n-1)+tribonacci (n-2)+tribonacci(n-3));
        if(end == start)
        System.out.println("Tribonacci series ");
        else
        System.out.println("Not tribonacci");
    }
    public static void main(String [] args) 
    {
        Tribo obj = new Tribo();
        obj.read();
        obj.display();
    }
}

*/


import java.util.*;

public class Tribo {
    int start;
    int end;

    Tribo() {
        start = 0;
        end = 0;
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        start = sc.nextInt();
    }

    int tribo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return tribo(n - 1) + tribo(n - 2) + tribo(n - 3);
        }
    }

    void display() {
        int num = tribo(start);
        int sum = tribo(start - 1) + tribo(start - 2) + tribo(start - 3);
        if (sum == start)
            System.out.println("Tribonacci series ");
        else
            System.out.println("Not tribonacci");
    }

    public static void main(String[] args) {
        Tribo obj = new Tribo();
        obj.read();
        obj.display();
    }
}
