import java.util.*;

public class arithmetis_excp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = sc.nextInt();
        System.out.println("Enter B value");
        int b = sc.nextInt();
        int chance = 0;
        
        while(true)
        {
            try {
                System.out.println(a / b);
                break;
            } 
            catch (ArithmeticException e) 
            {
                if (chance == 3)
                {
                    System.out.println("You reached max limit");
                    break;
                }
                System.out.println("You are having only " + (3 - chance) + " left");
                System.out.println("Enter a valid B number");
                b = sc.nextInt();
                chance++;
                }
        }

    }

}

//i want to see see ,what happens, if i dont give up