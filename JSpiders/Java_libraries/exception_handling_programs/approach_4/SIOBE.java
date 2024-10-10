import java.util.Scanner;
public class SIOBE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Java";
        int index = sc.nextInt();

        while(true)
        {
            try {
                System.out.println(s.charAt(index));
                break;
            } 
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("Enter valid index");
                index = sc.nextInt();
            }
        }
    }
}
