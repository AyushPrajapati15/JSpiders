import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];//12345
        for(int i=0;i<=size-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp = arr[size - 1];
        for(int i=size-1;i>=0;i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for(int i=0;i<=size-1;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
    
}
