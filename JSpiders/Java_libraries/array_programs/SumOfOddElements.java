/*
wap for below requirements
create an int array of size 5
store int values in an array during run time.
print sum of odd elements present in an array
*/
import java.util.Scanner;

public class SumOfOddElements {

    public static void main(String[] args) {
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
            if (arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of odd elements are");
        System.out.println(sum);
    }
}