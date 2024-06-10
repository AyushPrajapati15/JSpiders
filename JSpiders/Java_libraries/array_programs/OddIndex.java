/*
wap for below requirements
create an int array of size 5
store int values in an array during run time
print odd index elements present in an array
*/
import java.util.Scanner;

public class OddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements");
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements of array are");
        for(int i=0;i<=arr.length-1;i++)
        {
            if(i%2==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
