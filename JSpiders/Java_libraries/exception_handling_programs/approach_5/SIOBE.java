import java.util.Scanner;
public class SIOBE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Java";
        int index = sc.nextInt();
        int chances=0;
        while(true)
        {
            try {
                System.out.println(s.charAt(index));
                break;
            } 
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("You entered invalid index. you are left with "+(3-chances)+" chance");
                if (chances == 3) {
                    System.out.println("your account is blocked");
                    break;
                }
                index = sc.nextInt();
                chances++;
                
            }
        }
    }
}
