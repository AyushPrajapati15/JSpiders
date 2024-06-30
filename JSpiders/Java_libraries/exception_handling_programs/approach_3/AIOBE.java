import java.util.*;
public class AIOBE
{
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        arr[0]=5;
        arr[1]=4;
        arr[2]=7;
        arr[3]=9;
        arr[4] = 1;

        try {
            System.out.println(arr[3]);
            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
            try {
                System.out.println(arr[3]);
                
            } catch (ArrayIndexOutOfBoundsException e1) {
                
            }
            
        }
        


    }
}