/*
wap for below requirements
create an int array of size 5
store int values in an array during run time.
wap to check sum of even elements present in the odd index is even or odd  
print sum of odd elements present in an array
*/
import java.util.Scanner;
public class SumOfEvenElementsInOddIndexIsEvenOdd {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter the elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements of array are");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 == 1) {
                if (arr[i] % 2 == 0) {

                    sum += arr[i];
                }
            }
        }
        if (sum % 2 == 0) 
        {
            System.out.println("Sum of even elements present in the odd index is even");
        }
        else {
            System.out.println("Sum of even elements present in the odd index is odd");
        }
    }
}
/*
wap for below requirements
create an int array of size 5
store int values in an array during run time.
wap to check sum of even elements present in the odd index is even or odd  
print sum of odd elements present in an array
*/