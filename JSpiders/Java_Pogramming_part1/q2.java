/*import java.util.*;
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
    int tribo(int n);
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
    public static void main()
    {
        Tribo obj = new Tribo();
        obj.read();
        obj.display();
    }
}*/


import java.util.*;

public class Tribo {
    int start;

    Tribo() {
        start = 0;
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
    if (num == start) {
        System.out.println("Tribonacci series ");
    } else {
        System.out.println("Not tribonacci");
    }
}


    public static void main(String[] args) {
        Tribo obj = new Tribo();
        obj.read();
        obj.display();
    }
}




/*
import java.util.Scanner;

public class q2 {
    int[][] b;
    int[] a;
    int N;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        N = sc.nextInt();
        if (N > 2 && N < 10) {
            a = new int[N];
            System.out.println("Enter " + N + " numbers");
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            // Initialize b with the correct dimensions
            b = new int[N][N];
        } else {
            System.out.println("INVALID RANGE");
            System.exit(0);
        }
        System.out.println("Entered array is");
        display();
    }

    void display() {
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void sort() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Sorted array is");
        display();
    }

    void logic() {
        // Initialize b with the correct dimensions
        b = new int[N][N];

        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                if (index < N) {
                    b[i][j] = a[index++];
                }
            }
        }

        System.out.println("Pattern is");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        q2 obj = new q2();
        obj.input();
        obj.sort();
        obj.logic();
    }
}
*/