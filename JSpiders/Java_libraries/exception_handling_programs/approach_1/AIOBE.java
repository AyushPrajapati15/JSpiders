import java.util.Scanner;
public class AIOBE
{
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        // int size=sc.nextInt();
        int arr[] = new int[5];
        arr[0]=5;
        arr[1]=4;
        arr[2]=7;
        arr[3]=9;
        arr[4] = 1;
        int index = sc.nextInt();
        System.out.println(arr[index]);
    }
}