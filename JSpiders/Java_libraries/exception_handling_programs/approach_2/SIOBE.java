import java.util.Scanner;
public class SIOBE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Java";
        int index = sc.nextInt();

    try {
        System.out.println(s.charAt(index));
        
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Invalid index");
        
    }
    }
}
