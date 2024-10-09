/*import java.util.*;
class numdude{
	int num;
	numdude(){
		
}*/


import java.util.Scanner;
class q2
{
    int b[][];
    int a[];
    int N;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        N= sc.nextInt();
        if(N>2&&N<10)
        {
            a = new int[N];

            System.out.println("Enter "+N+" numbers");
            for(int i =0;i<N;i++)
            {
                a[i] =sc.nextInt();
            }
            b =new int[N][N];
        }
        else
        {
            System.out.println("INVALID RANGE");
            System.exit(0);
        }
        System.out.println("Enterd array is");
        display();
    }

    void display()
    {
        for(int i =0;i<N;i++)
        {
            System.out.print(a[i]+" ");

        }
        System.out.println();
    }

    void sort()
    {
        for(int i = 0;i<N;i++)
        {
            for(int j = 0;j<N;j++)
            {
                if(a[i]>a[j])
                {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }

            }
        }
        System.out.println("Sorted array is");
        display();
    }

    void logic()
    {
        for(int i = 0;i<N;i++)
        {
            int j =0;
            for(;j<N-i;j++)
            
                b[i][j] = a[j];
            
            for(int k = 0;k<i;k++)
            
                b[i][j++] = a[k];
                
            
        }
        
        System.out.println("Pattern is");
        for(int i = 0;i<N;i++)
        {
            for(int j =0;j<N;j++)
            {
                System.out.print(b[i][j]+"t");
            }
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        q2 ob = new q2();
        ob.input();
        ob.sort();
        ob.logic();
    }

}