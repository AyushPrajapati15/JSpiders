import java.util.*;

public class arithmetis_excp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = sc.nextInt();
        System.out.println("Enter B value");
        int b = sc.nextInt();
        
        while(true)
        {
            try {
                System.out.println(a / b);
                break;
            } 
            catch (ArithmeticException e) 
            {
                System.out.println("Enter a valid b number");
                b = sc.nextInt();
                }
        }

    }

}

